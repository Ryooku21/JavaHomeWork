//2. Написать метод, который определяет, является ли год високосным,
// и возвращает boolean(високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.


package Seminar1;

import java.util.Scanner;

public class S1Task2 {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner scan_year = new Scanner(System.in);
        int year = scan_year.nextInt();
        if (LeapYear(year)){
            System.out.println("Year is leap");
        } else {
            System.out.println("Year is normal");
        }
    }

    public static boolean LeapYear (int some_year){
        return (some_year % 4 == 0) && (some_year % 100 != 0) || (some_year % 400 == 0);
    }
}
