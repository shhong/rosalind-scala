package rosalind
/* (c) Copyright 2012 Sungho Hong. All Rights Reserved. */
import common._

object KMP {
    def while0(cond: Int => Boolean)(f: Int => Int, j: Int): Int = 
        if (cond(j)) while0(cond)(f, f(j)) else j
    
    def preprocess(p: String): List[Int] = {
        def loop(s:String, j: Int, b: List[Int]): List[Int] = s match {
            case "" => b.reverse
            case _ => {
                val j1 = while0(x => x>=0 && s.head!=p(x))(x => b(b.size-x-1), j) + 1
//                println("%s %d".format(s.head, j) + " " + b.reverse.toString)
                loop(s.tail, j1, j1::b)
            }
        }
        loop(p, -1, List(-1))
    }
    
    def search(t: String, p: String): List[Int] = {
        val b = preprocess(p)        
        def loop(i: Int, j: Int, report: List[Int]): List[Int] = 
            if (i==t.length) report.reverse
            else {
                println("%d %d : %s".format(i, j, report.mkString(" ")))
                val j1 = while0(x => x>=0 && t(i)!=p(x))(x => b(x), j) + 1
                if (j1==p.length) loop(i+1, b(j1), (i-j+1)::report) 
                else loop(i+1, j1, report)
            }
        loop(0, 0, List())
    }
}

object SpeedUpMotifFinding {

  def main(args: Array[String]) {
      val dnaString = read_data("kmp")(args).replaceAll("\n", "")
      
      println(KMP.preprocess(dnaString).drop(1).mkString(" "))
      
   }
}
