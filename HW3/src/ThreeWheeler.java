// Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3. Провести проверку принципа LSP.

public class ThreeWheeler extends Car {
    private String model;

    public ThreeWheeler(String brand, String model, String color, String bodyType, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, 3, fuelType, transmissionType, engineVolume);
        this.model = model;
    }

    
    @Override
    public void move() {
        System.out.println("Трехколесный автомобиль" + model + " движется");
    }

    @Override
    public void service() {
        System.out.println("Трехколесный автомобиль" + model + "находится в обслуживании");
    }

    @Override
    public void changeGear() {
        System.out.println("Переключение передач у трехколесного автомобиля " + model);
    }

    @Override
    public void turnOnLights() {
        System.out.println("Включение фар трехколесного автомобиля " + model);
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Включение дворников трехколесного автомобиля " + model);
    }

    @Override
    public void turnOnFogLights() {
        System.out.println("Включение противотуманных фар трехколесного автомобиля " + model);
    }

    @Override
    public void transportCargo() {
        System.out.println("Перевозка грузов на трехколесном автомобиле " + model);
    }
}

// Принцип LSP (Liskov Substitution Principle) гласит, что объекты должны быть заменяемыми на своих наследников без изменения свойств программы.
// В данном случае мы создали конкретный класс ThreeWheeler, который наследует абстрактный класс Car.
// Мы не изменили свойства программы при замене объектов класса Car на объекты класса ThreeWheeler. Таким образом, принцип LSP соблюден.
// Если создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» как «полёт», т.е. изменить метод move() на метод fly(),
// то будет нарушение принципа LSP. В данном случае, если мы создадим класс FlyingCar, который наследует класс Car и переопределяет метод move() на fly(), 
// то это может привести к нарушению принципа LSP. Например, если есть метод, который принимает объект типа Car и вызывает у него метод move(),
// то при передаче объекта типа FlyingCar этот метод не будет работать корректно, поскольку ожидается, что метод move() будет выполнять движение на земле, а не полёт. 
