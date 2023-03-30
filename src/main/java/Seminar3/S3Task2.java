//2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.


        package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;

public class S3Task2 {
        public static void main(String[] args) {

                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

                System.out.println("Максимальный элемент списка равен: " + FindMax(list));
                System.out.println("Минимальный элемент списка равен: " + FindMin(list));
                System.out.println("Среднее арифметическое равно: " + FindAverage(list));
        }

        public static int FindMax(ArrayList<Integer> arrayList) {
                int max = 0;
                for (int j : arrayList) {
                        if (j > max) {
                                max = j;
                        }
                }
                return max;
        }

        public static int FindMin(ArrayList<Integer> arrayList) {
                int min = arrayList.get(1);
                for (int j : arrayList) {
                        if (j < min) {
                                min = j;
                        }
                }
                return min;
        }

        public static int FindAverage(ArrayList<Integer> arrayList) {
                int count = 0;
                for (Integer integer : arrayList) {
                        count += integer;
                }
                return count / arrayList.size();
        }

}

