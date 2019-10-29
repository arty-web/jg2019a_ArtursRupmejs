package lv.jg.lesson5.level3;

public class TVTest {

    public static void main(String[] args) {

        TVController remote = new TVController();
        TV sony = new TV("Sony");
        remote.connect(sony);

        remote.decreaseVolume();
        remote.turnOn();
        remote.nextChannel();
        remote.nextChannel();
        remote.nextChannel();
        remote.increaseVolume();
        remote.increaseVolume();
        remote.decreaseVolume();
        remote.previousChannel();
        remote.turnOn();
        remote.turnOff();
        remote.nextChannel();
        remote.turnOn();

    }

}