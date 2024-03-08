package org.example.ch8._4

/**
 * Bundle.
 *
 * @author Vitalii Chura
 */
class Bundle extends Item {
  val items = collection.mutable.ListBuffer[Item]()
  override def price: Double = {
    items.map(item => item.price).sum
  }

  def addItem(item: Item): Unit = {
    items += item
  }

  override def description: String = s"This bundle contains ${items.size} items"
}
