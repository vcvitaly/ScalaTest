package org.example.ch9._7

import scala.io.Source

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("data/ch9/7.txt")
    source.mkString.split("\\s+").filter(s => !s.matches("\\d+\\.\\d+")).foreach(s => println(s))
    source.close()
  }
}
