public class Car implements Driveable {
    private String name;
    private int horsepower;
    private int weight;
    private TypeOfCar typeOfCar;
    private  SteeringWheel steeringWheel;
    private Engine engine;


    public Car(String name, int horsepower, int weight) {
        this.horsepower = horsepower;
        this.name = name;
        this.weight = weight;
        this.steeringWheel = new SteeringWheel();
        this.engine = new Engine();
    }

    public Car(String name, int horsepower, int weight, TypeOfCar typeOfCar) {
        this.horsepower = horsepower;
        this.name = name;
        this.weight = weight;
        this.typeOfCar = typeOfCar;
        this.steeringWheel = new SteeringWheel();
        this.engine = new Engine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;


    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

}
