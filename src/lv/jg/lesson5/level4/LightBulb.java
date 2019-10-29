package lv.jg.lesson5.level4;

import static java.lang.System.out;

public class LightBulb {

    private boolean turnedOn;
    private int currentTurnOnCount;
    private int maxTurnOnCount = 5;

    public void turnOn() {
        if (currentTurnOnCount != maxTurnOnCount) {
            turnedOn = true;
            currentTurnOnCount++;
            out.print("Result: Light bulb turned on. ");
            out.printf("(%d)", currentTurnOnCount);
            out.println();
        } else {
            out.println("Result: Nothing happened because max turn-ons reached.");
        }
    }

    public void turnOff() {
        turnedOn = false;
        out.println("Result: Light bulb turned off.");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

}