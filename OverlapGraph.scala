package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object OverlapGraph {

  def printO3(x: List[(String, String, String)]): Unit = if (!x.isEmpty) {
      def loop(y: (String, String, String), z: List[(String, String, String)]): Unit = z match {
          case Nil => printO3(x.tail)
          case _ => (y, z.head) match {
              case ((n1g, n1p, n1s), (n2g, n2p, n2s)) => {
                  if (n1s==n2p) println("%s %s".format(n1g, n2g))
                  else if (n1p==n2s) println("%s %s".format(n2g, n1g))
                  loop(y, z.tail)
              }
          }
      }
      loop(x.head, x.tail)
  }
    
  def main(args: Array[String]) {
      val lines = read_data("grph")(args)      
      val k = 3
      
      val preSuf = readFASTA(lines).map(x => x match {case (x, y) => (x, y.take(k), y.takeRight(k))})
      printO3(preSuf.toList)
   }
}
