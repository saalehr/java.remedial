public class Car extends Vehicle
{

    protected Integer year;
    protected String make;
    protected String model;

    public Car() {
        // Super class constructor call
        // super();
        System.out.println("Constructing a default Car");
    }

    public Car(Integer year, String make, String model) {
        // Super class constructor call
        super(800);
        System.out.println("Constructing a specific Car");
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public void drive () {
        System.out.println("Driving Car");
    }
}
