package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object EnumeratingGeneOrders {
  class BranchPoint(basec: List[Int], remainingc: List[Int]) {
      val base = basec
      val remaining = remainingc
      override def toString :String = "BP(" + base.toString + "," + remaining.toString + ")"
  }
      
  def branchOut(bp: BranchPoint): List[BranchPoint] = 
      (for(x <- bp.remaining) yield new BranchPoint(bp.base ++ List(x), bp.remaining.diff(List(x)))).toList
          
  def sweep(bps: List[BranchPoint]): List[BranchPoint] = {
      val z = bps.map(branchOut)
      z.tail.foldLeft(z.head)((x, y) => x ++ y)}

  def generatePerms(n:Int): List[List[Int]]= {
      def loop(x: List[BranchPoint]): List[List[Int]] = x.head.remaining match {
          case Nil => x.map(y => y.base)
          case _ => loop(sweep(x))
      }
      loop(List(new BranchPoint(List(), (1 to n).toList))) 
  }

  def main(args: Array[String]) {
      val n: Int = read_data("perm")(args).replaceAll("\n", "").toInt

      val perms = generatePerms(n)

      println(perms.length)
      println(perms.map(x => x.mkString(" ")).mkString("\n"))      
  }
}