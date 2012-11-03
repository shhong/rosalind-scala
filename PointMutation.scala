package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object PointMutation {

  def hamming(line1: String, line2: String, acc: Int = 0): Int = (line1, line2) match {
      case (x, "") => acc + x.length
      case ("", x) => acc + x.length
      case (x, y) => hamming(x.tail, y.tail, acc + (if (x.head==y.head) 0 else 1))
  }

  def main(args: Array[String]) {
      val lines: (String, String) = read_data("hamm")(args)
                                     .split("\n")
                                     .toList match {
          case x::y::_ => (x,y)
          case _ => throw new Exception("We need two strings.")
      }
      
      println(hamming(lines._1, lines._2))
  }
}