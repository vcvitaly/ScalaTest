package org.example.ch7

/**
 * package.
 *
 * @author Vitalii Chura
 */
package object _3 {
  val a = 1664525
  val b = 1013904223
  val n = 32
  var seed: Int = 0

  def nextInt(): Int = {
    ((seed * a + b) % Math.pow(2,n)).toInt
  }

  def setSeed(seed: Int): Unit = {
    _3.seed = seed
  }
}
