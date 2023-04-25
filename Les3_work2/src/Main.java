/*Створіть файл, запишіть у нього довільні дані та закрийте файл.
 * Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*/

import java.io.*;

public class Main {
    public static void main(String[] args){
        File file = new File("test.txt");

        try (PrintWriter pw = new PrintWriter(new FileWriter(file, false));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            pw.write("The Java Tutorials are practical guides for programmers who want " +
                    "to use the Java programming language to create applications. " +
                    "They include hundreds of complete, working examples, and dozens " +
                    "of lessons. Groups of related lessons are organized into \"trails\".");
            pw.flush();
            int t;
            while ((t = br.read()) != -1) {
                System.out.print((char) t);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}