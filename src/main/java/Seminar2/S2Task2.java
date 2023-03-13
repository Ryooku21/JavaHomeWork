//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package Seminar2;

import java.io.FileWriter;

public class S2Task2 {
    public static void main(String[] args) {
        String word = "TEST";
        WriteTest(word);
    }
    public static void WriteTest(String word){
        StringBuilder sb = new StringBuilder();
        sb.append(word.repeat(100));
        try{
            try (FileWriter fr = new FileWriter("test.txt")) {
                fr.write(String.valueOf(sb));
                fr.flush();
            }

        }catch (Exception e){
            System.out.println("Can't do that!");
        }
    }
}
