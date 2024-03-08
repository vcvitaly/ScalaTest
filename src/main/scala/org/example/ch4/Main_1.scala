package org.example.ch4

import scala.collection.mutable.ArrayBuffer

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main_1 {

  def main(args: Array[String]): Unit = {
    val gizmos = Map("Macbook Pro 14" -> 2000, "Vitamix E310" -> 350)
    val gizmosWithDiscount = for ((k, v) <- gizmos) yield (k, v*0.9)
    println(gizmosWithDiscount)
  }

}
