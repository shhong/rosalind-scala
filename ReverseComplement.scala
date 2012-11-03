package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object ReverseComplement {
  
  def complement(x: Char): Char = x match {
      case 'A' => 'T'
      case 'G' => 'C'
      case 'C' => 'G'
      case 'T' => 'A'
  }
  
  def main(args: Array[String]) {
      val lines = read_data("revcon")(args).replaceAll("\n","").reverse
      println(lines.map(complement))
  }
}
