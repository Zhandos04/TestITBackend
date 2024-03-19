package ZhandosSpring.Lesson2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи две числы: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат " + a * b);
            System.out.println("Закончить или нет? ");
            int c = scanner.nextInt();
            if (c == 1) {
                break;
            }
        }
    }
}
