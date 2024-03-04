package ZhandosSpring.Lesson2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Введите сумму вклада : ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        System.out.println("Введите срок вклада : ");
        int month = scanner.nextInt();

        int i = 0;
        while(i < month) {
            sum += sum + sum * 0.07;
            i++;
        }
        System.out.println("После " + month + "месяцев сумма вклада составит " + sum);
    }
}
