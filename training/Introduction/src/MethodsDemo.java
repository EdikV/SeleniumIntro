public class MethodsDemo {
    public static void main (String [] args){
        // in order to access the mehtod getdata in this class we first must create an object of class methodsdemo
        // below we declare a new object named d that will access the methods in methodsdemo, using the . operator
        MethodsDemo d = new MethodsDemo();

        d.getData();

    }
    // why use methods - lines of code that are re-used, you can wrap them under a class and use them repeatedly.
    // The method should be declared outside the main block.
    public void getData()
    {
    System.out.println("Hello World");
    }
}
