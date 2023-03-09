//3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному,
// нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

package Seminar1;

public class S1Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 2, 3};
        int val = 3;
        int count = 0;
        int length = array.length - 1;

        System.out.println("Existing array: ");
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == val){
                array[i] = array[i+1];
                count++;
            }
        }

        for (int i = 0; i <= count; i++) {
            array[length] = val;
            length--;
        }

        System.out.println("Sorted array: ");
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
}
