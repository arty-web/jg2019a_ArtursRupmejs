package lv.jg.lesson5.level3;

public class TVController {

    //jābūt iekapsulētam - private
    TV television;

    public void connect(TV television) {
        this.television = television;
    }

    public void turnOn() {
        television.turnOn(television);
    }

    public void nextChannel() {
        television.nextChannel();
    }

    public void increaseVolume() {
        television.increaseVolume();
    }

    public void decreaseVolume() {
        television.decreaseVolume();
    }

    public void previousChannel() {
        television.previousChannel();
    }

    public void turnOff() {
        television.turnOff();
    }

}