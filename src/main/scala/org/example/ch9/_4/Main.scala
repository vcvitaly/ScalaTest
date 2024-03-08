package org.example.ch9._4

import scala.io.Source

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("data/ch9/4.txt")
    val array = source.getLines().map(_.toFloat).toArray
    println(array.sum)
    println(array.sum / array.length)
    println(array.max)
    println(array.min)

  }
}
