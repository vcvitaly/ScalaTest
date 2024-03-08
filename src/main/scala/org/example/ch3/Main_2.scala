package org.example.ch3

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_2 {

  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5)
    for (i <- 0 to (if (a.length % 2 == 0) a.length - 1 else a.length - 2) by 2) {
      val tmp = a(i)
      a(i) = a(i + 1)
      a(i + 1) = tmp
    }
    println(a.mkString("Array(", ", ", ")"))
  }

}
