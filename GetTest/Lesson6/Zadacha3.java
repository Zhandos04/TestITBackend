package ZhandosSpring.Lesson6;

public class Zadacha3 {
    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 19) {
            m4a[x] = new Mix4();
            m4a[x].counter++;
            count++;
            count += m4a[x].maybeNew(x);
            x++;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
}
class Mix4 {
    int counter = 0;
    public int maybeNew(int index) {
        if(index < 1) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}

/*
x < 9 index < 5 _______ 14 1
x < 9 index < 5 _______ 25 1
x < 7 index < 7 _______ 14 1
x < 19 index < 1 _______ 20 1
 */
