package lv.jg.lesson5.level4;

public class SwitcherTest {

    public static void main(String[] args) {

        Switcher lightSwitch = new Switcher();
        LightBulb philips = new LightBulb();

        lightSwitch.connect(philips);

        for (int a = 1; a != 13; a++) {
            lightSwitch.switchOnOff();
        }
    }

}