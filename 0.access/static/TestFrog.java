public class TestFrog {

    public static void main(String[] args) {

        Frog frog1 = new Frog();
        Frog frog2 = new Frog();

        frog1.frogsNumber();
        frog2.frogsNumber();

        // You can use an instance to invoke a static method
        frog1.frogsCount();
        frog2.frogsCount();

        // You generally use the class to invoke static methods
        Frog.frogsCount();

        // You cannot invoke a non-static method using the class
        //Frog.frogNumber();

    }

}
