package ex_14_Strings;


public class Lab141_String_Interview_P2_equalsOperation {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");


        // == -> Comparison -> String => this check the ref location
        System.out.println("string literals comparison with the string objects");
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);


        System.out.println("String literals comparison, same string pool reference comparison");
        System.out.println(s1 == s2);

        //object comparison
        System.out.println(" Strings object comparison");
        System.out.println(s3 == s5);
        System.out.println(s4 == s3);


        // equals ( content) -> value
        System.out.println("equals method will only check the content value for the objects so scp with the object creation content ");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

         }
}
