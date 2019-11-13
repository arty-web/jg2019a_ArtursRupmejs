package lv.jg.lesson5.level2.task1;

import static java.lang.System.out;
import java.util.Objects;

public class TV {

    private int currentChannel, currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    public TV(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", channel='" + currentChannel + '\'' +
                ", volume='" + currentVolumeLevel + '\'' +
                ", turned on='" + turnedOn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return Objects.equals(manufacturer, tv.manufacturer) &&
                Objects.equals(currentChannel, tv.currentChannel) &&
                Objects.equals(currentVolumeLevel, tv.currentVolumeLevel) &&
                Objects.equals(turnedOn, tv.turnedOn);
    }

    public void nextChannel() {
        out.println("Action: User pressed the 'Next channel' button.");
        if (turnedOn == true) { //salidzināšana nav nepieciešama "if (turnedOn) {"
            currentChannel++;
            out.println("Result: Current channel is now '" + currentChannel + "'.");
        } else {
            out.println("Result: Nothing happened because TV wasn't turned on.");
        }
        out.println();
    }

    public void previousChannel() {
        out.println("Action: User pressed the 'Previos channel' button.");
        if (turnedOn == true) {//salidzināšana nav nepieciešama "if (turnedOn) {"
            currentChannel--;
            out.println("Result: Current channel is now '" + currentChannel + "'.");
        } else {
            out.println("Result: Nothing happened because TV wasn't turned on.");
        }
        out.println();
    }

    public void increaseVolume() {
        out.println("Action: User pressed the 'Increase volume' button.");
        if (turnedOn == true) {//salidzināšana nav nepieciešama "if (turnedOn) {"
            currentVolumeLevel++;
            out.println("Result: Current volume is now '" + currentVolumeLevel + "'.");
        } else {
            out.println("Result: Nothing happened because TV wasn't turned on.");
        }
        out.println();
    }

    public void decreaseVolume() {
        out.println("Action: User pressed the 'Decrease volume' button.");
        if (turnedOn == true) {//salidzināšana nav nepieciešama "if (turnedOn) {"
            currentVolumeLevel--;
            out.println("Result: Current volume is now '" + currentVolumeLevel + "'.");
        } else {
            out.println("Result: Nothing happened because TV wasn't turned on.");
        }
        out.println();
    }

    public void turnOn(TV tv) {
        out.println("Action: User pressed the 'Turn on' button.");
        if (turnedOn == false) {//salidzināšana nav nepieciešama "if (!turnedOn) {"
            currentChannel = 1;
            currentVolumeLevel = 15;
            turnedOn = true;
            out.println("Result: TV turned on. ");
            System.out.println(tv);
        } else {
            out.println("Result: Nothing happened because TV was already turned on.");
        }
        out.println();
    }

    public void turnOff() {
        //šeit pietiek tik ar stāvokļa iestatīšanu, jo nekas cits nemainās un pārbade nav
        //turnedOn = false;
        //out.println("Result: TV turned off.");

        out.println("Action: User pressed the 'Turn off' button.");
        if (turnedOn == true) {
            turnedOn = false;
            out.println("Result: TV turned off.");
        } else {
            out.println("Result: Nothing happened because TV was already turned off.");
        }
        out.println();
    }

}