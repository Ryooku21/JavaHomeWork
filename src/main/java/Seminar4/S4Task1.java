//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так,
//        чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.


package Seminar4;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class S4Task1 {
    public static void main(String[] args) {

        LinkedList<String> user_data = new LinkedList<>();
        Scanner input_string = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Введите значение строки. " +
                    "После ввода каждого значения нужно нажать 'Enter'.\n" +
                    "Если ввести 'print' значения будут выведены в терминал в обратном порядке. \n" +
                    "Если ввести 'revert' последнее введенное значение будет удалено.");
            user_data.add(input_string.nextLine());

            if (Objects.equals(user_data.getLast(), "print")){
                user_data.removeLast();
                System.out.println(ListReverse(user_data));
                flag = false;
            } else {
                if (Objects.equals(user_data.getLast(), "revert")){
                    user_data.removeLast();
                    user_data.removeLast();
                    System.out.println(user_data);
                    flag = false;
                }
            }
        }
    }

    public static LinkedList<String> ListReverse(LinkedList<String> list) {
        LinkedList<String> reverse_list = new LinkedList<>();

        while (!list.isEmpty()) {
            reverse_list.addLast(list.getLast());
            list.removeLast();
        }
        return reverse_list;
    }
}
