package lv.jg.lesson3.level2;

//Ok
public class CarTest {

    public static void main(String[] args) {

        //varbūt labak nosaukt par "myBeemer" vai ko tādu
        Car firstCar = new Car("BMW", 2006);
        firstCar.setColor("black");

        Car secondCar = new Car("Toyota", 2011);
        secondCar.setColor("silver");

        displaySummary(firstCar);
        displaySummary(secondCar);
    }

    public static void displaySummary(Car Car) {
        System.out.print("Customer has chosen a " + Car.getColor() + " ");
        System.out.println(Car.getManufacturer() + " from " + Car.getYear());
    }

}
