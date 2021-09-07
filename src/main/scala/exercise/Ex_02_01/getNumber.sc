/**
 * while Java promotes the imperative Style of Programming
 * Scala Promotes the functional style by use of expressions.
 *
 * JAVA, In order to calculate the value of number you use an if loop,
 *        which is a statement meaning that the loop by itself does something,
 *        but does not return a value.
 *        So you need to set the value of number inside the if and return explicitly.
 *
 *        public static in getNumber(int a, int b) {
 *          int number;
 *          if (a < b){
 *            number = 10;
 *          } else {
 *            number = 5;
 *          }
 *          return number;
 *        }
 *
 *
 * On the other hand in Scala,
 *        conditions like if loop and looping with for are expressions.
 *        which means they return values.
 */

def getNumber(a: Int, b: Int): Int = {
  val number = if (a < b) 10 else 5
  number
}

getNumber(23, 10)