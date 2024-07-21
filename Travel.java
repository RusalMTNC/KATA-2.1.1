package Kata.Tasks.Task1;

public class Travel {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 23.17f);
        Driver dr1 = new Driver("Ruslan", car1);
        dr1.driveByCar();

    }
}
