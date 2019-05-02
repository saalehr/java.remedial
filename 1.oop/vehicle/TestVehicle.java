public class TestVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.show());

        Car car = new Car();

        Car car2 = new Car(2000, "Toyota", "Rav4");
        
        Mercedes m = new Mercedes();
        
        car.drive();
        car2.drive();
        m.drive();

        System.out.println(m.show());

        Bike bike = new Bike();

        bike.ride();

    }
}
