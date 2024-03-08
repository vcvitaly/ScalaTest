package org.example.ch5._7

/**
 * Person.
 *
 * @author Vitalii Chura
 */
class Person(fullName: String) {
  val firstName = fullName.split(" ")(0)
  val lastName = fullName.split(" ")(1)
}
