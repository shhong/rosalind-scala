package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object RNATranscription {
  def main(args: Array[String]) {
      val lines = read_data("rna")(args)
      println(lines.replaceAllLiterally("T", "U"))
  }
}

