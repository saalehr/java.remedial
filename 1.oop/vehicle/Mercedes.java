public class Mercedes extends Car {
    
    private static final Integer MAX_SPEED = 150;

    public Mercedes() {
        // super(); Implicit call
        System.out.println("Constructing a Mercedes");
        setName("Mercedes");
        setTopSpeed(MAX_SPEED);
    }

    // override parent's drive behavior
    public void drive() {
        System.out.println("Driving a Mercedes");
        super.drive();
    }


}
