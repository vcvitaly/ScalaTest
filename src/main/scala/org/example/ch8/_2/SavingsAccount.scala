package org.example.ch8._2

import org.example.ch8._1.BankAccount


/**
 * SavingsAccount.
 *
 * @author Vitalii Chura
 */
class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var freeTransactions = 3

  override def deposit(amount: Double): Double = {
    if (freeTransactions > 0) {
      freeTransactions -= 1
      super.deposit(amount)
    } else {
      super.deposit(amount - 1)
    }
  }

  override def withdraw(amount: Double): Double = {
    if (freeTransactions > 0) {
      freeTransactions -= 1
      super.withdraw(amount)
    } else {
      super.withdraw(amount + 1)
    }
  }

  def earnMonthlyInterest(): Unit = {
    freeTransactions = 3
    super.deposit(currentBalance * 1.01)
  }
}
