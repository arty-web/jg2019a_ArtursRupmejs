package lv.jg.lesson2;

//Ok
public class MathOperations {

    public static void main(String[] args) {
        int firstNr = 9;
        int secondNr = 4;
        int sumResult = firstNr + secondNr;
        int subtractResult = firstNr - secondNr;
        int divideIntResult = firstNr / secondNr;
        double divideDoubleResult = (double) firstNr / secondNr;
        int multiplyResult = firstNr * secondNr;
        int remainderResult = firstNr % secondNr;

        System.out.println("Numbers are: " + firstNr + " and " + secondNr);
        System.out.println("**************************");
        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Divide int result: " + divideIntResult);
        System.out.println("Divide double result: " + divideDoubleResult);
        System.out.println("Multiply result: " + multiplyResult);
        System.out.println("Remainder result: " + remainderResult);
    }
}
