public class TestStaticPoly {

    public static void main(String[] args) {

        Mercedes m = new Mercedes();
        m.fuelUp();
        System.out.println(m);

        Mercedes m1 = new Mercedes();
        m1.fuelUp(0, 3);
        System.out.println(m1);

        return;

    }
}
