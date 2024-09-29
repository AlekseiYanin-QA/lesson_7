public class ElectricCar extends Car implements Driveable{
    public ElectricCar(String name, int horsepower,  int weight, TypeOfCar typeOfCar) {
        super(name, horsepower, weight, typeOfCar);
    }

    public void drive() {
        getSteeringWheel().steer();

    }
}
