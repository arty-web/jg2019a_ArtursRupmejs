package lv.jg.lesson3.level1;

//OK
public class CircleTest {

    public static void main(String[] args) {

        Circle myCircle = new Circle();
        myCircle.setRadius(15);

        double radius = myCircle.getRadius();
        double area = myCircle.calculateArea();
        System.out.println("Circle area for radius " + radius + " is " + area);
    }

}