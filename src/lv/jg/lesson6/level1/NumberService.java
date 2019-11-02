package lv.jg.lesson6.level1;

import static java.lang.System.out;

public class NumberService {

    public void sumInRange(int a, int b) {
        int bb = b;
        int rangeSum = 0;

        if (a > b) {
            while (bb <= a) {
                rangeSum = rangeSum + bb;
                bb++;
            }
        } else {
            while (a <= bb) {
                rangeSum = rangeSum + bb;
                bb--;
            }
        }
        out.println(a + " and " + b + " is " + rangeSum + ";");
    }

    public void getEvenNumberCount(int a, int b) {
        int bb = b;
        int evenNumbers = 0;

        if (a > b) {
            for (; bb <= a; bb++) {
                if (bb % 2 != 0) {
                    continue;
                }
                evenNumbers++;
            }
        } else {
            for (; a <= bb; bb--) {
                if (bb % 2 != 0) {
                    continue;
                }
                evenNumbers++;
            }
        }
        out.println(a + " and " + b + " is " + evenNumbers + ";");
    }

}