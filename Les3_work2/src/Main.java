/*Створіть файл, запишіть у нього довільні дані та закрийте файл.
 * Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*/

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.write("Best year ");
            pw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int t;
            while ((t = br.read()) != -1) {
                System.out.print((char) t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}