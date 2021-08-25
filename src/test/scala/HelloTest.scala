import org.scalatest.FunSuite

/**
 * Created by ashishjam on 8/24/2021
 */
class HelloTest extends FunSuite {
  test("sayHello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
