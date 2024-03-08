package org.example.ch9._5

import java.io.PrintWriter

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val out = new PrintWriter("data/ch9/5.txt")
    for (i <- 0 to 20) {
      val toPow = math.pow(2, i)
      out.println(f"$toPow%-15s${1/toPow}")
    }
    out.close()
  }
}
