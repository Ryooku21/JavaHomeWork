package Seminar1;

import java.util.Random;

public class S1Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Array with randomly generated numbers from 1 to 10: ");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
