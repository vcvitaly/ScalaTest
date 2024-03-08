package org.example.ch3

import scala.collection.mutable.ArrayBuffer

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_4 {

  def main(args: Array[String]): Unit = {
    val a = Array(-1,0,1,2)
    val positiveNums = for (elem <- a if elem > 0) yield elem
    val zeroOrNegativeNums = for (elem <- a if elem <= 0) yield elem
    val tmp = ArrayBuffer[Int]()
    tmp ++= positiveNums
    tmp ++= zeroOrNegativeNums
    println(tmp.toArray.mkString("Array(", ", ", ")"))
  }

}
