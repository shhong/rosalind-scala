package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object ExpectedValue {
  import Probability.p
  
  def power(x: Double, n: Int, acc: Double = 1): Double =
      if (n==0) acc else power(x, n-1, x*acc)
      
  def expectedValue(m: Int, n: Int)(gcContent: Double) = {
      power(p(gcContent), m)*(n-m+1)
  }
  
  def main(args: Array[String]) {
      val lines = read_data("eval")(args).split("\n")
      val strlens = lines(0).split(" ").map(_.toInt)
      val gcContents = lines(1).split(" ").map(_.toDouble)
      
      println(gcContents.map(expectedValue(strlens(0), strlens(1)))
               .map(x => "%.6f".format(x)) mkString(" "))
  }
}