package org.example.ch9._3

import scala.io.Source

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    Source.fromFile("data/ch9/3.txt").mkString.split("\\s+").filter(w => w.length > 4).foreach(w => println(w))
  }
}
