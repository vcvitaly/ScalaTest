package org.example.ch9._2

import java.io.PrintWriter
import scala.io.Source

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val fileName = "data/ch9/2.txt"
    val source = Source.fromFile(fileName, "UTF-8")
    val lines = source.getLines.toArray
    source.close()
    val out = new PrintWriter(fileName)
    val tabPattern = """\t""".r
    for (elem <- lines) {
      out.println(tabPattern.replaceAllIn(elem, " " * 4))
    }
    out.close()
  }
}
