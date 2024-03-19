package ZhandosSpring.Lesson3;

public class Practice1 {
}
class Test {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
class DrumKit {
    boolean topHat = true;
    boolean snare = true;
    public void playSnare() {
        System.out.println("Hello");
    }
    public void playTopHat() {
        System.out.println("World");
    }
}