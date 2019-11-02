package lv.jg.lesson6.level2;

public class CarTest {

    public static void main(String[] args) {

        Car bmw = new Car("BMW 5-series", "black", 75);
        System.out.print(bmw);
        bmw.accelerate(50);
        bmw.slowDown(35);
        bmw.speedUp();
        bmw.accelerate(90);
        bmw.slowDown(35);
        bmw.slowDown(-10);
        bmw.accelerate(20);
        bmw.slowDown(0);
        bmw.slowDown(0);

    }

}