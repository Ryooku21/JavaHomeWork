//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


        package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;


public class S3Task3 {
        public static void main(String[] args) {
                ArrayList<String> stringList = new ArrayList<>(Arrays.asList("1","arr","is", "12","string" ));
                System.out.println("Исходный массив:");
                System.out.println(stringList);
                System.out.println("Обработанный массив:");
                System.out.println(RemoveDigits(stringList));
        }

        public static ArrayList<String> RemoveDigits(ArrayList<String> list){
                for (int i = 0; i < list.size(); i++) {
                        if (isDigit(list.get(i))){
                                list.remove(i);
                        }
                }
                return list;
        }

        private static boolean isDigit(String s) throws NumberFormatException {
                try {
                        Integer.parseInt(s);
                        return true;
                } catch (NumberFormatException e) {
                        return false;
                }
        }
}
