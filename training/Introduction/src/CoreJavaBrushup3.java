import java.util.Locale;

public class CoreJavaBrushup3 {
    public static void main(String[] args) {
        //String in Java is an object

        //2 string with same value are combined when using
        // string a= abc
        // string b= abc, both objects will merge together - called string literal
        // if the declaration is made like
        // string s1 = new string ('abc');
        // string s2 = new string ('abc'); - 2 objects will be created
        //  String s2= new String("Hello \n Peter Parker");
        //  You can choose how to split a string with split command
        //  String[] splitted = s2.split("Peter");
        //  System.out.print(splitted[0]);
        //  If you want to trim excess spaces from a string you can use the s.trim()
        //  System.out.print(splitted[1].trim());
        //  Print each character
        //  for (int i=0; i<s2.length();i++)
        //  {
            //      System.out.print(s2.charAt(i));

            //  }
        //  String txt = "Please locate where 'locate' occurs!";
        //  System.out.println(txt.indexOf("locate"));

        String txt ="abcdefghijklmno";
        for (int i=0; i<txt.length(); i++){
            System.out.println(txt.charAt(i));

        }


    }}
