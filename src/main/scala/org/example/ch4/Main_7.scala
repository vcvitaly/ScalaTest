package org.example.ch4

import scala.jdk.CollectionConverters._

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_7 {

  def main(args: Array[String]): Unit = {
    val props = java.lang.System.getProperties.asScala
    val tabbedLength = props.keySet.maxBy(_.length).length() + 8
    for ((k, v) <- props) println(String.format("%-" + tabbedLength + "s| %s",k, v))
  }

}
