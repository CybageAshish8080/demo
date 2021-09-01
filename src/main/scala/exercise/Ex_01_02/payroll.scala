package exercise.Ex_01_02

/**
 * Created by Ashish Jambhale on 9/1/2021
 *
 * This is enhance way of representation of Payroll challenge
 * In Scala when we create a class, it automatically creates a primary constructor and the corresponding getter and setter methods for any fields declared in the class.
 *
 * This is the Template that has the payroll extends app.
 */
object payroll extends App {
  var e1 = new Employee("Vijay", "Mavale")
  var e2 = new Employee("Prakash", "Gosavi", salaried = 's')
  println(e1)
  println(e2)

}

class Employee(val fName:String, val lName:String, var salaried:Char = 'h') {
  def fullName:String = fName + " " + lName

  override def toString = "Employee name: " + fName + " " + lName +
    (if(salaried == 'h') "\nHourly Employee" else "\nSalaried Employee") +
    ("\n" + "="*20)
}
