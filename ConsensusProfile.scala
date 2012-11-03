package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object ConsensusProfile {

  def elemSum[T](as: Seq[T], bs: Seq[T])(implicit n: Numeric[T]) = {
    import n.mkNumericOps
    require(as.size == bs.size)
    for ((a, b) <- as.iterator zip bs.iterator) yield (a + b)
  }
      
  def count(dnaStrings: Seq[String])(c: Char): List[Int] = {
      val Acount = dnaStrings.map(_.map(x => if (x==c) 1 else 0)).map(_.toList)      
      (Acount.head /:Acount.tail)(elemSum(_,_).toList)      
  }
      
  def transpose[T](x: List[List[T]]): List[List[T]] = {
      val range = (0 until x(0).length).toList
      range.map(i => (for (y <- x) yield y(i)).toList)
  }

  val acgt = List('A','C','G','T')
  
  def findOneConsensus(votes: List[List[Int]]):String = 
      transpose(votes).map(x => (acgt zip x).maxBy(_._2)._1).mkString
      
  def main(args: Array[String]) {
      
      val lines = read_data("cons")(args).split("\n")
      val votes = acgt.map(count(lines))
      
      println(findOneConsensus(votes))
      println((acgt zip votes.map(_.mkString(" "))).map(x => "%s: %s".format(x._1, x._2)).mkString("\n"))
      
   }
}
