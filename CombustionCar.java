public class CombustionCar extends Car implements Driveable {
    public CombustionCar(String name, int horsepower,  int weight, TypeOfCar typeOfCar) {
        super(name, horsepower, weight, typeOfCar);
    }

        public void drive() {
        getEngine().startEngine();
        getSteeringWheel().steer();
        getEngine().stopEngine();
    }
}
