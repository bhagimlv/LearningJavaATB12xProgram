package ex_04_Operators;

public class Lab051_InstanceOf_Operator {
    public static void main(String[] args) {
        // New Operator
        String s1 = new String("Pramod");
        int a = 10;
        // Learn this in OOPs
        System.out.println("Instance of operator used to know about the variable is related to the particular class or not");
        System.out.println(s1 instanceof String);
        System.out.println((Integer)a instanceof Integer);

    }
}
