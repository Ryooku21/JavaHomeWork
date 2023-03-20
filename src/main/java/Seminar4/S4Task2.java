//2. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.


package Seminar4;

import java.util.LinkedList;

public class S4Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> existing_list = new LinkedList<>();
        existing_list.add(1);
        existing_list.add(2);
        existing_list.add(3);
        existing_list.add(4);
        existing_list.add(5);

        System.out.println("Задан список: ");
        System.out.println(existing_list);
        System.out.println();
        System.out.println("Заданный список развернут в обратном порядке: ");
        System.out.println(ListReverse(existing_list));
    }
    public static LinkedList<Integer> ListReverse(LinkedList<Integer> list){
        LinkedList<Integer> reverse_list = new LinkedList<>();

        while (!list.isEmpty()) {
            reverse_list.addLast(list.getLast());
            list.removeLast();
        }
        return reverse_list;
    }
}