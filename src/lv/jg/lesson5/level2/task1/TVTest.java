package lv.jg.lesson5.level2.task1;

public class TVTest {

    public static void main(String[] args) {

        TV sony = new TV("Sony");
        sony.turnOn(sony);
        sony.nextChannel();
        sony.nextChannel();
        sony.nextChannel();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.decreaseVolume();
        sony.previousChannel();
        sony.turnOn(sony);
        sony.turnOff();
        sony.nextChannel();
        sony.decreaseVolume();

    }

}