public class App {
    public static void main(String[] args){
        Auto myAuto = new Auto("Lada", "Vesta", "Black", "Sedan", 4, "Gasoline", "Auto", 1.6);
        Auto myAuto2 = new Auto("KAMAZ", "КамАЗ 6522", "Orange", "Truck", 6, "diesel", "Manual transmission", 11.8);
        ThreeWheeler myThreeWheeler = new ThreeWheeler("Reliant", "Regal", "Red", "Hatchback", "Gasoline", "Manual transmission", 0.7);
        CarGasoline myCarGasoline = new CarGasoline("Lada", "Granta", "blue", "liftback", 4, "Manual transmission", 1.4);
        CarDiesel myCarDiesel = new CarDiesel("UAZ", "Patriot", "Gray", "pick-up", 4, "Manual transmission", 2.3);
        
        myAuto.move();
        myAuto2.sweepStreet();        
        myThreeWheeler.changeGear();
        myThreeWheeler.turnOnFogLights();
        myThreeWheeler.refuel();
        myCarGasoline.refuel();        
        myCarDiesel.refuel();
        myAuto.getInfo();
    }
}
