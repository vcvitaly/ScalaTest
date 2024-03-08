package org.example.ch5._1

/**
 * Counter.
 *
 * @author Vitalii Chura
 */
class Counter {
  private var value = 0
  def increment(): Unit = {
    if (value < Int.MaxValue) {
      value += 1
    }
  }
  def current = value

}
