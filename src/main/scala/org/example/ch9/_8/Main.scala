package org.example.ch9._8

import scala.io.Source

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val source = Source.fromURL("https://horstmann.com", "UTF-8")
    val pattern = """<img\s.*(src='[^']+').*>""".r
    for (m <- pattern.findAllMatchIn(source.mkString)) println(m.group(1))
    source.close()
  }
}
