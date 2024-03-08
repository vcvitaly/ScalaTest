package org.example.ch8._1

/**
 * BankAccount.
 *
 * @author Vitalii Chura
 */
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance

  def deposit(amount: Double): Double = {
    balance += amount
    balance
  }
  def withdraw(amount: Double): Double = {
    balance -= amount
    balance
  }
}
