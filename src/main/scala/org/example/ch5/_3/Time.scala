package org.example.ch5._3

/**
 * Time.
 *
 * @author Vitalii Chura
 */
class Time(val hrs: Int, val min: Int) {
  def before(other: Time): Boolean = {
    if (hrs < other.hrs) true
    else if (hrs == other.hrs) {
      if (min < other.min) true else false
    }
    else false
  }

}
