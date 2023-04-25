package Advanced_io_nio;

/*Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
 * Виведіть на екран вміст файлу.*/

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("It's my life!");
            bw.flush();
            int s;
            while ((s = br.read()) != -1) {
                System.out.print((char) s);
            }

        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }
}