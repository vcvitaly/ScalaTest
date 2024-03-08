package org.example.ch8._8

/**
 * Person.
 *
 * @author Vitalii Chura
 */
class Person(val name: String) {
  override def toString: String = s"${getClass.getName}[name=$name]"
}
