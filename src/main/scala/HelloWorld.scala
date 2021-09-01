/**
 * Created by Ashish Jambhale on 8/24/2021
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    //this is my first Scala program
    println("Hello, world!")

    /**
     * declare variables
     */
    var firstName: String = "Ashish"
    val age: Int = 40
    println(firstName + ", is "+age+" years old")
    var sum = 10 + 25
    def function1: Unit = {
      println("This is function1")
    }
    function1
  }
}
