/*Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
 * Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну
 * речення з нового рядка.*/

public class Main {
    public static void main(String[] args) {
        String line = "Любіть Україну, як сонце любіть, як вітер, і трави, і води. " +
                "В годину щасливу і в радості мить, любіть у годину негоди.";
        String sub = line.substring(0, line.length() / 2) + "\n" + line.substring(line.length() / 2, line.length());
        System.out.println(sub);
        //рівність підрядків
        String sub1 = line.substring(0, line.length() / 2);
        String sub2 = line.substring(line.length() / 2);
        int l1 = sub1.length();
        int l2 = sub2.length();
        System.out.println(l1 + " \n" + l2);

    }
}