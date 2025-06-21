package ex_14_Strings;

public class Lab144_StringFunctions {
    public static void main(String[] args) {

        String s = "Java".substring(2);
        System.out.println("Starting with the index 2 to the end of string ");
        System.out.println(s);

        System.out.println("Starting with the begin index to the last index excluding it");
        String s1 = "Java".substring(1, 3);
        System.out.println(s1);

        System.out.println("tochararray converts string to chararray");
        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        System.out.println("removes the spaces in begining and in ending");
        String st = " Java ".trim(); // "Java"
        System.out.println(st);

        System.out.println("isBlank will return the string is blank or not ");
        boolean b = "   ".isBlank();
        System.out.println(b);

        System.out.println("repeat function repeats the string , as per the count provided ");
        String s2 = "ab".repeat(3);
        System.out.println(s2);

        System.out.println("equalsignorecase and return the boolean value");
        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        System.out.println("format function replace the format specifiers with the actual values ");
        String s111 = String.format("%s = %d", "age", 25);
        System.out.println(s111);

        System.out.println(" \"a\\nb\\nc\".lines().count() will provide how many lines count");
        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
