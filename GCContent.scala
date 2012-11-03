package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object GCContent {
    
  def countGC(ncd: String): Double = ((ncd.count(_=='G') + ncd.count(_=='C'))*100.0)/(ncd.length)
  
  def main(args: Array[String]) {
      val lines = read_data("gc")(args)
      
      readFASTA(lines)
       .map(p => p match {case (x, y) => (x, countGC(y))})
       .maxBy(_._2) match {case (x,y) => println("%s\n%.6f%%".format(x,y))}
   }
}
