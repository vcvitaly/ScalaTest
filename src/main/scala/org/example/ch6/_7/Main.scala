package org.example.ch6._7

import org.example.ch6._6.CardSuit._

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    println(isRed(Diamonds))
    println(isRed(Clubs))
    println(isRed(Hearts))
    println(isRed(Spades))
  }

  def isRed(cardSuit: Value): Boolean = {
    cardSuit match {
      case Diamonds => true
      case Clubs => false
      case Hearts => true
      case Spades => false
    }
  }
}
