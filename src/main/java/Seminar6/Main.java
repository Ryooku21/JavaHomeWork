//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию

package Seminar6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook acer = new Notebook("Acer", 16, 500, "GTX 1600", "Intel I5");
        Notebook hp = new Notebook("HP", 8, 250, "RX 550", "AMD 3050");
        Notebook asus = new Notebook("Asus", 32, 1000, "GTX 3080", "Intel I7");
        Notebook mac = new Notebook("MacBook", 16, 500, "Apple M1 Pro", "Apple M1 Pro");
        Notebook lenovo = new Notebook("Lenovo", 8, 250, "RX 5600", "AMD Ryzen 7");

        ArrayList<Notebook> notesList = new ArrayList<>();
        notesList.add(acer);
        notesList.add(hp);
        notesList.add(asus);
        notesList.add(mac);
        notesList.add(lenovo);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите минимальное значение оперативной памяти:");
        int ramValue = scan.nextInt();
        for (Notebook note: notesList) {
            if (note.ram >= ramValue){
                System.out.println(note.getValues());
            }
        }

        System.out.println("Ведите название бренда:");
        String brandName = scan.next();
        for (Notebook note: notesList) {
            if (Objects.equals(note.brand, brandName)){
                System.out.println(note.getValues());
            }
        }
    }
}

