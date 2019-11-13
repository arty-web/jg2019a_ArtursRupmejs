package lv.jg.lesson5.level4;

public class Switcher {

    LightBulb bulby;  //typo

    public void connect(LightBulb bulby) {
        this.bulby = bulby;
    }

    public void switchOnOff() {

        System.out.println("Action: Light switch was pressed.");
        if (bulby.isTurnedOn() == false) { //if (bulby.isTurnedOn())
            bulby.turnOn();
            System.out.println();  //šo ir jāiznes aiz "if"a
        } else {
            bulby.turnOff();
            System.out.println();   //šo ir jāiznes aiz "if"a
        }

    }

}