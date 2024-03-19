package ZhandosSpring.Lesson3Git;

public class Zadacha1 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "X", 240);
        Car car2 = new Car("Volkswagen", "Passat", 260);
        car1.start();
        car2.start();
        car1.stop();
        car2.stop();
        System.out.println(car1);
        System.out.println(car2);
    }
}
class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println(brand + " " + model + "start");
    }
    void stop() {
        System.out.println(brand + " " + model + "stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}