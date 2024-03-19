package ZhandosSpring.Lesson2Git;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число : ");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("Это четное число");
        }else System.out.println("Это нечетное число");
    }
}
