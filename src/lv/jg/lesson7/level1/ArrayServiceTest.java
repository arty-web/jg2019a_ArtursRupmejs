package lv.jg.lesson7.level1;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] myArray = service.create(10);
        service.fillArrayWithRandomNumbers(myArray);
        service.printArrayToConsole(myArray);
        service.sumInArray(myArray);

        int[] yourArray = service.create(10);
        service.fillArrayWithRandomNumbers(yourArray);
        service.printArrayToConsole(yourArray);
        service.sumInArray(yourArray);

    }

}