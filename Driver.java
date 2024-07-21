package Kata.Tasks.Task1;
/*Класс должен быть статическим и публичным.
Все поля класса должны быть private.
Класс должен иметь конструктор, который заполняет все поля. Параметры должны быть в том же порядке, что и поля.
Метод driverByCar должен использовать метод drive класса Car.
Метод driveByCar использует в логике свое поле Car.
Метод dirveByCar должен отвечать следующим логическим условиям:
Если количество топлива у машины меньше 10, то в консоль выводится надпись: "Ох, доехать бы до заправки» и вызывается метод drive.
Если количество топлива 0, то в консоль выводится надпись: «Сегодня я никуда не поеду" и на этом логика метода заканчивается
Если топлива больше 10, то в консоль выводится надпись: «Вроде права не забыл, ну поехали» и вызывается метод drive.
Добавь getters/setters, если это необходимо.*/

public class Driver {
    private String driverName; // имя водителя
    private Car car; // машина водителя

    public Driver(String driverName, Car car) {
        this.driverName = driverName;
        this.car = car;
    }

    public void driveByCar() {
if(car.getFuelQuantity()<10){
    System.out.println("Ох, доехать бы до заправки.");
    car.drive(new Driver(this.driverName, this.car));
} else if (car.getFuelQuantity() == 0) {
    System.out.println("Сегодня я никуда не поеду.");
} else if (car.getFuelQuantity() >= 10) {
    System.out.println("Вроде права не забыл, ну поехали.");
    car.drive(new Driver(this.driverName, this.car));
}

    }

    public String getDriverName() {
        return driverName;
    }
}
