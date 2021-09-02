package exercise.Ex_01_05

import scala.collection.immutable.List

/**
 * Created by Ashish Jambhale on 9/1/2021
*/
object BankAccountChallenge extends App {
  var b1 = new BankAccount("Rajesh Mishra", 50.00)
  var b2 = new BankAccount("Kiran Mishra", 500.00, 's')
  List(b1, b2).foreach(println)
}

class BankAccount(name:String, balance: Double, typeOfAccount: Char = 'c') {

  var accountNumber: Int = BankAccount.nextAccountNum()
  override def toString: String = "Client name: " + name + " balance $" + balance +
    (if(typeOfAccount == 'c') "\nCurrent" else "\nSaving") + "Account Number: " +
    accountNumber + "\n" + "*" * 30
}

/**
 * Singleton object created for bank account number
 */
object BankAccount {
  var accountNum = 5000
  def nextAccountNum(): Int = {
    accountNum += 1
    accountNum
  }
}