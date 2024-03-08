package org.example.ch4

import scala.collection.mutable

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_6 {

  def main(args: Array[String]): Unit = {
    val map = mutable.LinkedHashMap(
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday"-> java.util.Calendar.TUESDAY,
      "Wednesday"-> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday"-> java.util.Calendar.FRIDAY,
      "Saturday"-> java.util.Calendar.SATURDAY,
      "Sunday"-> java.util.Calendar.SUNDAY
    )

    for ((k, v) <- map) println(s"$k -> $v")
  }

}
