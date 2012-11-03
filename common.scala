/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
package object common {
    
def read_data(casename: String)(args: Array[String]): String = {
    val filename = "data/" + args(0) + "_" + casename + ".txt"
    val source = scala.io.Source.fromFile(filename)
    val lines = source.mkString
    source.close
    lines      
}

def readFASTA(s: String): Iterator[(String, String)] = {
    val Process = ">([a-zA-Z]+_[0-9]+)\n([ACTG\n]+)".r
    for (p <- Process.findAllIn(s)) yield p match {
        case Process(x, y) => (x, y.replaceAll("\n", ""))
    }
}

}