public class Main {

    public static void main(String[] args) {
        Car renaultLogan = new Car("Renault", 113, 1165);
        Car citroenC4 = new Car("Citroen", 180, 1491);
        Car bmwX5 = new CombustionCar("BMW", 184, 1990, TypeOfCar.JEEP);
        Car tesla = new ElectricCar("Tesla", 180, 1491, TypeOfCar.SEDAN);

        testCar(renaultLogan);
        testCar(citroenC4);
        testModCar(bmwX5);
        testModCar(tesla);


    }

    public static void testCar(Car car) {
        System.out.println("--------------");
        System.out.printf("Наименование: %s\nЛошадиные силы: %d\nВес: %d%n",
                car.getName(),
                car.getHorsepower(),
                car.getWeight());
        car.getEngine().startEngine();
        car.getSteeringWheel().steer();
        car.getEngine().stopEngine();
        System.out.println("--------------");
    }

    public static void testModCar(Car car) {
        System.out.println("--------------");
        describeCar(car);
        driveCar((Driveable) car);
        System.out.println("--------------");
    }

    public static void describeCar(Car car) {
        System.out.printf("Наименование: %s\nТип: %s\nЛошадиные силы:: %d\nВес: %d%n",
                car.getName(), car.getTypeOfCar(), car.getHorsepower(), car.getWeight());
    }

    public static void driveCar(Driveable driveable) {
        driveable.drive();
    }
}
