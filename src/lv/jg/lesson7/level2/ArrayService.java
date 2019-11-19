package lv.jg.lesson7.level2;

import java.util.*;

//Ok
public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101); //"101" jāiznes konstantē
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.printf("Array: \t%s\n", Arrays.toString(array));
    }

    public void sortArray(int[] array) {
        boolean sorted = true;
        int j = 0;
        int tmp;
        //man izskatās, ka mainīgā patiesā nozīme ir "isUnsorted"
        while (sorted) {//izmantojam nosukumā "is" vai "has"
            sorted = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = true;
                }
            }
        }
        System.out.printf("Sorted: %s\n", Arrays.toString(array));
    }

    public void sortArrayByCheating(int[] array) {
        Arrays.sort(array);
        System.out.printf("Sorted: %s\n", Arrays.toString(array));
    }

    public void swap(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.printf("Swap: \t%s\n", Arrays.toString(array));
    }

}