package org.example.ch8._8

/**
 * SecretAgent.
 *
 * @author Vitalii Chura
 */
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}
