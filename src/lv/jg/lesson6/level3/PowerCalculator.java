package lv.jg.lesson6.level3;

public class PowerCalculator {

    //metodei ir jāatgriež rezultāts
    public void pow(int number, int power) {
        //šī pārbaude nav nepieciešama, jo uzdevumā tika teikts, ka tā pieņem tikai pozitīvas vērtības
        if (number > 0 && power > 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number; // lietojam īsāku pierakstu: result =* number
            }
            System.out.println("Number " + number + " raised to the power of " + power + " equals " + result + ";");

        } else {
            System.out.println("By entering '" + number + "' and '" + power
                    + "' you failed the simple task of providing positive integers;");
        }
    }

}