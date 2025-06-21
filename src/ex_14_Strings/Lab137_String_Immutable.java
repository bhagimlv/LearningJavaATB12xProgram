package ex_14_Strings;

public class Lab137_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";//one object in pool with hello
        s1  = s1.concat("world"); //second object in pool -hello world
        System.out.println(s1);
    }
}
