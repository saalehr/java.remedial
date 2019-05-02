public class Mercedes extends Car {
    
    private static final Integer MAX_SPEED = 150;

    public Mercedes() {
        System.out.println("Constructing a Mercedes");
        setName("Mercedes");
        setTopSpeed(MAX_SPEED);
    }

    // override parent's drive behavior
    public void drive() {
        // super must appear on the first line of the overridden method
        super.drive();
        System.out.println("Driving a Mercedes");
    }


}
