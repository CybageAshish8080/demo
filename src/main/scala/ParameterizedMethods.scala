/**
 * Created by ashishjam on 8/20/2021
 */
object ParameterizedMethods {

  def add(a: Int, b: Int): Int = a + b
  def sub(a: Int, b: Int): Int = a - b

  def operation(a: Int, b: Int, op: (Int, Int) => Int): Int = op(a, b)

  def main(args: Array[String]): Unit = {

    val addition = operation(2, 1, add)
    val substration = operation(2, 1, sub)

    println(s"Calling add op => $addition")
    println(s"Calling sub op => $substration")
  }

}
