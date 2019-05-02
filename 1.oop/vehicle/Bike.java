public class Bike extends Vehicle
{

    public Bike() {
        System.out.println("Contructing a Bike");
    }

    private Integer numberOfWheels;
    private BikeType bikeType;

    public Bike(Integer numberOfWheels, BikeType bikeType) {
        this.numberOfWheels = numberOfWheels;
        this.bikeType = bikeType;
    }

    public void ride() {
        System.out.println("Riding Bike");
    }


}

enum BikeType {
    MOUNTAIN,
    CITY
}


