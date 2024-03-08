package org.example.ch8._1

/**
 * CheckingAccount.
 *
 * @author Vitalii Chura
 */
class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = {
    super.deposit(amount - 1)
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount + 1)
  }
}
