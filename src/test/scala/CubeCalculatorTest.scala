import org.scalatest.FunSuite

/**
 * Created by ashishjam on 8/24/2021
 */
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube"){
    assert(CubeCalculator.cube(3) === 27)
  }
}
