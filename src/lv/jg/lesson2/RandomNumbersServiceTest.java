package lv.jg.lesson2;

import static java.lang.System.out;
import java.util.Random;

//Ok
public class RandomNumbersServiceTest {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(5);    //I know it's not good to use a, b, c as variables :)
        int b = randomGenerator.nextInt(10);
        int c = randomGenerator.nextInt(15);

        int sum = a + b + c;
        out.println("The random-generated numbers are: " + a + ", " + b + " and " + c);
        out.println("The sum of those three numbers is: " + sum);
    }
}