public class TestVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        Car car = new Car();

        Car car2 = new Car(2000, "Toyota", "Rav4");
        
        Mercedes m = new Mercedes();
        
        car.drive();
        car2.drive();
        m.drive();

        System.out.println(vehicle.show());

        // println will invoke the object's toString method
        // for a visual representation of the object
        System.out.println(vehicle);

        System.out.println(m.show());

        // Mercedes does not override toString but inherits Vehicle's
        System.out.println(m);

        Bike bike = new Bike();

        bike.ride();

    }
}
