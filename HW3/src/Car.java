// Спроектировать абстрактный класс «Car» у которого должны быть свойства: 
// марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; 
// методы: движение, обслуживание, переключение передач, включение фар, включение дворников.

public abstract class Car implements iRefuelingStation /* Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car». */ {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String transmissionType;
    private double engineVolume;

    public Car(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    public abstract void move();

    public abstract void service();

    public abstract void changeGear();

    public abstract void turnOnLights();

    public abstract void turnOnWipers();

    public void sweepStreet() {
        System.out.println(model + " Подметает улицу");
    }
    // Метод sweepStreet() был добавлен в класс Car, чтобы показать, что можно добавлять новые методы в абстрактный класс без нарушения принципа SRP.

    public abstract void turnOnFogLights();

    public abstract void transportCargo();
    // Принцип OCP (Open-Closed Principle) гласит, что классы должны быть открыты для расширения, но закрыты для изменения.
    // В данном случае мы расширили абстрактный класс Car, добавив два новых метода: turnOnFogLights() и transportCargo().
    // При этом мы не меняли уже существующие методы класса, а только расширили его функциональность. Таким образом, принцип OCP соблюден.

    @Override
    public void refuel() {
        System.out.println("Заправка автомобиля "  + model);        
    }

    @Override
    public void wipeHeadlights() {
        System.out.println("Протирание фар " + model);        
    }

    @Override
    public void wipeMirrors() {
        System.out.println("Протирание зеркал " + model);
        
    }

    @Override
    public void wipeWindshield() {
        System.out.println("Протирание лобового стекла " + model);        
    }

    // Проверка принципа ISP:
    // ISP (Interface Segregation Principle) гласит, что клиенты не должны зависеть от интерфейсов, которые они не используют.
    // Если мы имплементировали все методы интерфейса "Заправочная станция" в классе "Car", то это может привести к нарушению принципа ISP,
    // так как некоторые клиенты могут использовать только один или два метода из этого интерфейса, а не все.
    // Чтобы избежать этой проблемы, можно создать дополнительные интерфейсы, содержащие только те методы, которые нужны конкретному клиенту,
    // и имплементировать их в класс "Car". Например, мы можем создать интерфейс "Refuelable", содержащий только метод "refuel()", и имплементировать его в класс "Car"

    // Метод для выдачи информации по авто
    public void getInfo() {
        System.out.println("===============");
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Число колёс: " + numberOfWheels);
        System.out.println("Тип топлива: " + fuelType);
        System.out.println("Тип коробки передач: " + transmissionType);
        System.out.println("Объём двигателя: " + engineVolume);
        System.out.println("===============");
    }
}