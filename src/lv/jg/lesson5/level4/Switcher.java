package lv.jg.lesson5.level4;

public class Switcher {

    LightBulb bulby;

    public void connect(LightBulb bulby) {
        this.bulby = bulby;
    }

    public void switchOnOff() {

        System.out.println("Action: Light switch was pressed.");
        if (bulby.isTurnedOn() == false) {
            bulby.turnOn();
            System.out.println();
        } else {
            bulby.turnOff();
            System.out.println();
        }

    }

}