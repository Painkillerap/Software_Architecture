// Создать конкретный автомобиль путём наследования класса «Car».

public class Auto extends Car {
    private String model;

    public Auto(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
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
}