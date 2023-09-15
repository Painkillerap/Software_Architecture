// Создать путём наследования класса «Car» два автомобиля: 
// с бензиновым и дизельным двигателями, имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
// Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.

public class CarDiesel extends Car{
    private String model;

    public CarDiesel(String brand, String model, String color, String bodyType, int numberOfWheels, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, "diesel", transmissionType, engineVolume);
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println(model + " движется");
    }

    @Override
    public void service() {
        System.out.println(model + " находится на обслуживании");
    }

    @Override
    public void changeGear() {
        System.out.println(model + " меняет передачу");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Фары " + model + " включены");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Дворники " + model + " включены");
    }

    @Override
    public void turnOnFogLights() {
        System.out.println("Противотуманные фары " + model + " включены");
    }

    @Override
    public void transportCargo() {
        System.out.println(model + " перевозит груз");
    }

    @Override
    public void refuel() {
        System.out.println(model + " заправлен дизелем");
    }
    // Мы создали два класса-наследника "CarGasoline" и "CarDiesel", которые имеют свои конструкторы и переопределяют метод "refuel()" из интерфейса "RefuelingStation".
    // Класс "CarGasoline" использует бензин в качестве топлива, а класс "CarDiesel" - дизель.
    // Проверка принципа DIP:
    // DIP (Dependency Inversion Principle) гласит, что модули верхнего уровня не должны зависеть от модулей нижнего уровня,
    // а оба типа модулей должны зависеть от абстракций. В нашем случае, классы "CarGasoline" и "CarDiesel" зависят от абстрактного класса "Car",
    // который содержит общие методы и свойства для обоих классов-наследников. Интерфейс "iRefuelingStation" также является абстракцией,
    // на которую зависят оба класса-наследника при имплементации метода "refuel()". Таким образом, принцип DIP соблюдается.
}