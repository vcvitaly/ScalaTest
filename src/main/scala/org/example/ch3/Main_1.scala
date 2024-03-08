package org.example.ch3

import scala.util.Random

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_1 {

  def main(args: Array[String]): Unit = {
    println(randomArray(10).mkString("Array(", ", ", ")"))
  }

  def randomArray(n: Int): Array[Int] = {
    val a = new Array[Int](n)
    for (i <- a.indices) a(i) = Random.nextInt(n)
    a
  }
}
