package org.example.ch5._7

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val fred = new Person("Fred Smith")
    println(s"${fred.firstName} ${fred.lastName}")
  }
}
