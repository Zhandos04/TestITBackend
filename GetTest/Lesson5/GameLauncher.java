package ZhandosSpring.Lesson5;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.startGame();
    }
}
class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        while (true) {
            System.out.println("Я загадываю число от 0 до 9...");
            int number = (int) (Math.random() * 10);
            System.out.println("Число, которое нужно угадать, - " + number);
            p1.guess();
            p2.guess();
            p3.guess();
            System.out.println("Первый игрок думает что, что это " + p1.number);
            System.out.println("Второй игрок думает что, что это " + p2.number);
            System.out.println("Третий игрок думает что, что это " + p3.number);
            if(number == p1.number || number == p2.number || number == p3.number) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + (number == p1.number));
                System.out.println("Второй игрок угадал?" + (number == p2.number));
                System.out.println("Третий игрок угадал?" + (number == p3.number));
                System.out.println("Конец игры.");
                break;
            }
        }
    }
}
class Player {
    int number = 0;
    void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
