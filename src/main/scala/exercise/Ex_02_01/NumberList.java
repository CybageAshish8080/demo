package exercise.Ex_02_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ashish Jambhale on 9/6/2021
 *
 * Problem Statement:
 * So consider that you have been given a list of numbers, and you have to do two things with them.
 *      1. For each number you have to identify if the number is even.
 *      2. and if is it, you have to multiply that number with 10
 *      and return the final list as the result.
 *
 * In language like Java, this is something which you could do.
 *      You would iterate on every number in that list.
 *      you would check if the number is divisible by 2
 *      and if it is, you multiply the number by 10, and
 *      you add it to a new list which we call that as results in below example.
 *      and finally we would return the results.
 *
 *  You can see it is easily 6-7 lines of code.
 *
 *  But in Scala, you can do that in 2 lines
 *
 *  def evenNumbersMultiplied(numbers: List[Integer]) = numbers.filter(_ %2 == 0).map(_ * 10)
 *
 *      You just take the numbers, which is the input,
 *      You filter the input by checking tha condition that the number is divisible by 2,
 *      and for the resulting numbers you would just multiply by 10
 */
public class NumberList {
    public static List<Integer> getEvenNumbersMultipliedBy(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();
        for (int number: numbers) {
            if (number % 2 == 0) {
                int newNumber = number *10;
                results.add(newNumber);
            }
        }
        return results;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,23,11,40));
        List results = NumberList.getEvenNumbersMultipliedBy(numbers);
        System.out.println(results);


    }
}
