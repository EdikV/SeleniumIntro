package corejava;
public class CoreJavaBrushup1 {
    public static void main(String[] args) {
        /* Auto generated method stub */

        int num=5;
        String website="Rahul Shetty Academy";
        char letter ='r';
        double num2=5.9;

        System.out.println(num + " is the stored value" + website);

        //Arrays - Storing multiple values under a singe variabe.

        // if you don't know the values of the array it is better to allocate space and then populate the array
        int[] arr = new int[5]; // We declared an array of integers int[], and we define it with size of 5
        arr[0] = 1;
        arr[1] = 2;

        //Method #2 of array declaration - if the values are already known
        int[] arr2 = {1,2,3,4,5,6};

        System.out.print(arr2[1]);

    //   //Loops
    //   for (int i=0;i< arr2.length;i++) {
    //       System.out.print(arr2[i]);

    //   }

        //Enhanced for loops

        for (int s:arr2){
            System.out.print("");
            System.out.println(s);
        }




        






    }}
