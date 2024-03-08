package org.example.ch4

import java.io.File
import java.util
import java.util.Scanner
import scala.jdk.CollectionConverters._

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_5 {

  def main(args: Array[String]): Unit = {
    val map = new util.TreeMap[String, Int]().asScala
    val in = new Scanner(new File("/Users/vcvitaly/file.txt"))
    while (in.hasNext()) {
      val s = in.next()
      val count = map.getOrElse(s, 0)
      map(s) = count + 1
    }
    for((k, v) <- map) println(s"$k -> $v")
  }

}
