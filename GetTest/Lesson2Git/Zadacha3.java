package ZhandosSpring.Lesson2Git;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 400 == 0) {
            System.out.println(366);
        }else if(num % 4 == 0  && num % 100 != 0) {
            System.out.println(366);
        }else System.out.println(365);
    }
}
