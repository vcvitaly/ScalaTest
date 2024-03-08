package org.example.ch5._1

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val counter = new Counter
    counter.increment()
    println(counter.current)
  }
}
