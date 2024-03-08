package org.example.ch6._4

/**
 * Point.
 *
 * @author Vitalii Chura
 */
class Point(val x: Int, val y: Int) {

}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}
