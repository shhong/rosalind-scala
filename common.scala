/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
package object common {
    
def read_data(casename: String)(args: Array[String]): String = {
    val filename = "data/" + args(0) + "_" + casename + ".txt"
    val source = scala.io.Source.fromFile(filename)
    val lines = source.mkString
    source.close
    lines      
}

}