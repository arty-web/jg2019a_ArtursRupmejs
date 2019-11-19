package lv.jg.lesson7.level1;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101); //101 vajag iznest kā konstatnti
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.print("Array: / ");
        for (int numberInArray : array) {
            System.out.print(numberInArray);
            System.out.print(" / ");
        }
        System.out.println();
    }

    //šai metodei būtu jāatgriež skaitlis - summa
    public void sumInArray(int[] array) {
        int arraySum = 0;
        for (int numberInArray : array) {
            arraySum += numberInArray;
        }
        //šai izvadei jabūt test klasē
        System.out.println("Sum of all numbers in the array: " + arraySum + ".\n");
    }

}