package lv.jg.lesson6.level3;

public class PowerCalculator {

    public void pow(int number, int power) {
        if (number > 0 && power > 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println("Number " + number + " raised to the power of " + power + " equals " + result + ";");

        } else {
            System.out.println("By entering '" + number + "' and '" + power
                    + "' you failed the simple task of providing positive integers;");
        }
    }

}