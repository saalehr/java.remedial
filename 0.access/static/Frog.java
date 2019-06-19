public class Frog {

    // Wrapper Class for int
    private static Integer count = 0;
    // Primitive type int
    private int number;

    public Frog() {
        
        count++;
        number++;

        System.out.println(count.equals(2));
        // cannot invoke method on primitive references
        // System.out.println(number.equals(2));
        System.out.println(number == 2);

        System.out.println("count = " + count + " number = " + number);

    }

    public static void frogsCount() {
        System.out.println("count = " + count);
    }

    //error: non-static variable number cannot be referenced from a static context
    //public static void frogsNumber() {
    public void frogsNumber() {
        System.out.println("number = " + number);
    }

}
