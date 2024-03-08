package org.example.ch7._6

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}
import scala.jdk.CollectionConverters._

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {

    val javaMap = new JavaHashMap[String, Int]()
    val javaMapAsScala = javaMap.asScala
    javaMapAsScala += ("Alice" -> 7, "Fred" -> 10)

    var scalaMap = ScalaHashMap() ++= javaMapAsScala
  }
}
