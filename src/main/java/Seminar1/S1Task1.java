package Seminar1;

import java.util.Random;

public class S1Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Array with randomly generated numbers from 0 to 9: ");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.println();
        System.out.println("Max value in array = " + FindMax(array));
        System.out.println("Min value in array = " + FindMin(array));
    }
    public static int FindMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int FindMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}