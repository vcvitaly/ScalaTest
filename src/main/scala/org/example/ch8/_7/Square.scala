package org.example.ch8._7

/**
 * Square.
 *
 * @author Vitalii Chura
 */
class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  def this(width: Int) {
    this(0, 0, width)
  }

  def this() {
    this(0)
  }
}
