package Kata.Tasks.Task1;
/*Класс должен быть статическим и публичным.
Все поля класса должны быть private.
Класс должен иметь конструктор, который заполняет все поля, кроме Driver driver. Параметры должны быть в том же порядке, что и поля.
Метод void drive  должен выводить в консоль сообщение по шаблону: «Ну что {Имя водиделя}, {марка машины} отвезет тебя куда угодно».
Метод должен заполнять свое поле driver.
Добавьте необходимые getters/setters, если это необходимо.*/

public class Car {
    private String modelName; // марка машины
    private Float fuelQuantity; // количество топлива
    private Driver driver = null; // сидит ли кто в машине

    public Car(String modelName, Float fuelQuantity) {
        this.modelName = modelName;
        this.fuelQuantity = fuelQuantity;
    }

    public void drive(Driver driver) {
        setDriver(driver);
        System.out.printf("Ну что %s, %s отвезет тебя куда угодно", this.driver.getDriverName(), getModelName());
    }


    public String getModelName() {
        return modelName;
    }

    public Float getFuelQuantity() {
        return fuelQuantity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

