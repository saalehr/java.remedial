public class Mercedes extends Car {
    
    private static final Integer MAX_SPEED = 150;
    private static final Integer MAX_FUEL = 40;

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

    public void fuelUp() {
        fuel = MAX_FUEL;
    }

    /**
     * fuelAmount in liters
     *
     */
    public void fuelUp(Integer fuelAmount) {
        fuel = fuelAmount;
    }

    /**
     *  Specify the fuel amount in liter or gallons. 
     *  Only one needs to have a non-zero value
     */

    public void fuelUp(Integer fuelLiter, Integer fuelGallons) {
        Integer fuelAmt = 0;

        if (fuelLiter == 0) {
            fuelAmt = fuelGallons * 4;
        } else {
            fuelAmt = fuelLiter;
        }

        fuelUp(fuelAmt);
    }

}
