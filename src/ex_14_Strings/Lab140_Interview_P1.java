package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        String s11 = "hello";
        //s1,s4,s10,s11 -only object and all the varaibles are refferring the same

        //s2,s3,s5 --3 objects will be created
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
    }
}
