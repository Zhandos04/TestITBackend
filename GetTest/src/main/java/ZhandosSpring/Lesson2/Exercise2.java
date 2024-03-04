package ZhandosSpring.Lesson2;

public class Exercise2 {
    public static void main(String[] args) {
        int people = 10000000;
        int r = 14;
        int s = 8;
        for (int i = 0; i < 10; i++) {
            double birth = r / 1000.0;
            double death = s / 1000.0;
            int a = (int) (people * birth);
            int b = (int) (people * death);
            people += (a - b);
            if(r > 7) r--;
            if(s > 6) s--;
        }
        System.out.println(people);
    }
}
