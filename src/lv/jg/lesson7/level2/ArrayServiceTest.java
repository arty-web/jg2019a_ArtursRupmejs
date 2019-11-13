package lv.jg.lesson7.level2;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] myArray = service.create(10);
        service.fillArrayWithRandomNumbers(myArray);
        service.printArrayToConsole(myArray);
        service.sortArray(myArray);
        service.swap(myArray);

        System.out.println();

        int[] yourArray = service.create(10);
        service.fillArrayWithRandomNumbers(yourArray);
        service.printArrayToConsole(yourArray);
        service.swap(yourArray);
        service.sortArrayByCheating(yourArray);

    }

}