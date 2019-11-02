package lv.jg.lesson6.level1;

import static java.lang.System.out;

public class NumberServiceTest {

    public static void main(String[] args) {

        NumberService num = new NumberService();

        out.println("Sum of range between:");
        num.sumInRange(2, 9);
        num.sumInRange(6, 4);

        out.println();

        out.println("Amount of even numbers between:");
        num.getEvenNumberCount(2, 10);
        num.getEvenNumberCount(10, 2);
        num.getEvenNumberCount(2, 9);
        num.getEvenNumberCount(9, 2);
        num.getEvenNumberCount(3, 9);
        num.getEvenNumberCount(9, 3);

    }

}