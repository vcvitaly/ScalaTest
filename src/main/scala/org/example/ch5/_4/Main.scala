package org.example.ch5._4

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val time = new Time(20, 0)
    val timeBefore = new Time(19, 59)
    val timeEq = new Time(20,0)
    val timeAfter = new Time(20,1)
    println(timeBefore.before(time))
    println(timeEq.before(time))
    println(timeAfter.before(time))
  }
}
