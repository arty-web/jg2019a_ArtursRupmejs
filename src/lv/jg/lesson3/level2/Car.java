package lv.jg.lesson3.level2;

//Ok
class Car {

    private String color;
    private String manufacturer;
    private int year;

    public Car(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYear() {
        return year;
    }

}