package ZhandosSpring.Lesson5;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player1 player1 = new Player1();
        System.out.format("У игрока %d слотов с оружием, введите номер, чтобы выстрелить, -1 чтобы выйти%n", player1.getSlotsCount());
        int slot;
        while (true) {
            slot = scanner.nextInt();
            if(slot == -1) {
                System.out.println("end");
                break;
            }
            player1.shotWithWeapon(slot);
        }
    }
}
class Player1 {
    private Weapon[] weaponSlots;
    public Player1() {
        weaponSlots = new Weapon[] {
                new Pistolet(),
                new Avtomat(),
                new RPG(),
                new Rogatka(),
                new VodnyiPistolet()
        };
    }
    public int getSlotsCount() {
        return weaponSlots.length;
    }
    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
class Weapon {
    public void shot() {
        System.out.println("weapon shot");
    }
}
class Pistolet extends Weapon {
    @Override
    public void shot() {
        System.out.println("pistolet shot");
    }
}

class Avtomat extends Weapon {
    @Override
    public void shot() {
        System.out.println("Avtomat shot");
    }
}
class RPG extends Weapon {
    @Override
    public void shot() {
        System.out.println("RPG shot");
    }
}
class Rogatka extends Weapon {
    @Override
    public void shot() {
        System.out.println("Rogatka shot");
    }
}
class VodnyiPistolet extends Weapon {
    @Override
    public void shot() {
        System.out.println("VodnyiPistolet shot");
    }
}