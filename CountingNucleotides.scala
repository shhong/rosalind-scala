package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object CountingNucleotides {
  def main(args: Array[String]) {
      val lines = read_data("dna")(args)
      def count(c: Char) = println("%s: %d".format(c, lines.count(x => (x==c))))
      
      count('A')
      count('C')
      count('G')
      count('T')
  }
}
