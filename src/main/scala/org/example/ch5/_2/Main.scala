package org.example.ch5._2

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val bankAccount = new BankAccount
    bankAccount.deposit(100)
    println(bankAccount.getBalance)
    bankAccount.withdraw(50)
    println(bankAccount.getBalance)
    bankAccount.withdraw(100)
    println(bankAccount.getBalance)
  }

}
