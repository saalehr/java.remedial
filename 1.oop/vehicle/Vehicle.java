public class Vehicle {
    protected String name;
    protected Integer topSpeed;

    public Vehicle() {
        System.out.println("Constructing a Vehicle");
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
}
