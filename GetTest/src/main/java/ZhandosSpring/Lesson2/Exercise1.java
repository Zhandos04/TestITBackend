package ZhandosSpring.Lesson2;

public class Exercise1 {
    public static void main(String[] args) {
        int people = 10000000;
        double birth = 14.0/1000.0;
        double death = 8.0/1000.0;
        int a = (int) (people * birth);
        int b = (int) (people * death);
        int c = a - b;
        for (int i = 0; i < 10; i++) {
            people += c;
        }
        System.out.println(people);
    }
}
