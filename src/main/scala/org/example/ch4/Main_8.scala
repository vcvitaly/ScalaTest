package org.example.ch4

import scala.jdk.CollectionConverters._

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_8 {

  def main(args: Array[String]): Unit = {
    println(minmax(Array(1,2,3,4,5)))
  }

  def minmax(values: Array[Int]): (Int, Int) = {
    (values.min, values.max)
  }
}
