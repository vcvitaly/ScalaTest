package org.example.ch8._9

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val creature = new Ant
    println(creature.env.mkString("Array(", ", ", ")"))
  }
}
