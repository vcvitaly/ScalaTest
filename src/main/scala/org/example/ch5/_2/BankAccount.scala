package org.example.ch5._2

/**
 * BankAccount.
 *
 * @author Vitalii Chura
 */
class BankAccount {
  private var balance = 0
  def getBalance = balance
  def deposit(amount: Int): Unit = {
    balance += amount
  }
  def withdraw(amount: Int): Unit = {
    if (balance - amount >= 0) {
      balance -= amount
    }
  }
}
