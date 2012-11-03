package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object FindMotif {

    def findMotif(str: String, motif: String, loc:Int = 1, acc: List[Int] = List()): List[Int] = 
        if (str.length < motif.length) acc.reverse else {
            if (str.take(motif.length) == motif) {
                findMotif(str.tail, motif, loc + 1, loc::acc)
            }
            else findMotif(str.tail, motif, loc + 1, acc)
        }

    def main(args: Array[String]) {
      val lines = read_data("subs")(args).split("\n")
      
      val dnaString: String = lines(0)
      val motif: String = lines(1)
      
      def redactMotif(x: String, i: Int): String = x.take(i) + "---------" + x.drop(i+motif.lenght)
      
      println(findMotif(dnaString, motif).mkString(" "))
    }
}
