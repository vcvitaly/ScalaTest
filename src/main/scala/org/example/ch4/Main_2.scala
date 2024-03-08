package org.example.ch4

import java.io.File
import java.util.Scanner

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_2 {

  def main(args: Array[String]): Unit = {
    val map = scala.collection.mutable.Map[String, Int]()
    val in = new Scanner(new File("/Users/vcvitaly/file.txt"))
    while (in.hasNext()) {
      val s = in.next()
      val count = map.getOrElse(s, 0)
      map(s) = count + 1
    }
    for((k, v) <- map) println(s"$k -> $v")
  }

}
