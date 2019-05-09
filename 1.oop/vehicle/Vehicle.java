public class Vehicle {
    protected String name;
    protected Integer topSpeed;

    public Vehicle() {
        System.out.println("Constructing a default Vehicle");
    }

    public Vehicle(Integer topSpeed) {
        this.topSpeed = topSpeed;
        System.out.println("Constructing a specific Vehicle");
    }

        
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public String show() {
        return "Name: " + name + " Top Speed: " + topSpeed;
    }

    public String toString() {
        System.out.println("Calling Vehicle's toString method");
        return "Name: " + name + " Top Speed: " + topSpeed;
    }
}
