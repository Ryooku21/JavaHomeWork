//1. Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).


package Seminar2;

import java.util.Scanner;

public class S2Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner text = new Scanner(System.in);
        String if_palindrome = text.nextLine();
        System.out.println(if_palindrome);
        if (IsPalindrome(if_palindrome)) {
            System.out.println("Text is palindrome!");
        } else {
            System.out.println("Text is not a palindrome.");
        }
    }

    public static boolean IsPalindrome(String message) {
        String input_string = message.replaceAll("\\W", "");
        input_string = input_string.toLowerCase();
        int j = input_string.length();
        for (int i = 0; i < j / 2; i++) {
            if (input_string.charAt(i) != input_string.charAt(j-1)) {
                return false;
            }
        }
        return true;
    }
}

