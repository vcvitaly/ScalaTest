package org.example.ch5._4

/**
 * Time.
 *
 * @author Vitalii Chura
 */
class Time(val hrs: Int, val min: Int) {
  private val minSinceMidnight = hrs * 60 + min
  def before(other: Time): Boolean = {
    if (minSinceMidnight < other.minSinceMidnight) true else false
  }

}
