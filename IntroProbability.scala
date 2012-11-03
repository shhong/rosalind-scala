package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object IntroProbability {
  def main(args: Array[String]) {
      val a = read_data("prob")(args).replaceAll("\n","").split(" ").map(_.toDouble)
      
      def p(x: Double): Double = 2*(x*x/4) + 2*((1-x)*(1-x)/4)
      
      println(a.map(x => "%.6f".format(p(x))).mkString(" "))
  }
}