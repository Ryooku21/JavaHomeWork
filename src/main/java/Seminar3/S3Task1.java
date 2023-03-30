//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)


        package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class S3Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
