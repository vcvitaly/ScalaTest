package org.example.ch4

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_9 {

  def main(args: Array[String]): Unit = {
    println(lteqgt(Array(-1, 0, 1, 2, 3)))
  }

  def lteqgt(values: Array[Int]): (Int, Int, Int) = {
    (values.count(i => i < 0), values.count(i => i == 0), values.count(i => i > 0))
  }
}
