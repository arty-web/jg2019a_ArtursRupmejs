package lv.jg.lesson6.level1;

import static java.lang.System.out;

//mainīgo nosaukumi ir neatbilstoši
public class NumberService {

    //šai metodei ir jāātgriž rezutāts
    public void sumInRange(int a, int b) {
        int bb = b;
        int rangeSum = 0;

        if (a > b) {
            //šo var iznest atsevišķā metodē, jo loģika atkārtojās tik mainīgie vietām jāsamaina
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
        //šo ir jāizvada testa klasei
        out.println(a + " and " + b + " is " + rangeSum + ";");
    }

    //skatīt komentārus iepriekš
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