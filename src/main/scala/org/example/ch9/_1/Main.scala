package org.example.ch9._1

import java.io.PrintWriter
import scala.io.Source
import scala.util.Using

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("1.txt", "UTF-8")
    val reversedLines = source.getLines.toArray.reverse
    source.close()
    val out = new PrintWriter("1.txt")
    for (i <- reversedLines) out.println(i)
    out.close()
  }
}
