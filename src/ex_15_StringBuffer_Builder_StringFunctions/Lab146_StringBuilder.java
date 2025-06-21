package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(123);
        System.out.println("In String buffer No need to assign the modified string to another string variable");
        System.out.println(stringBuilder);
    }
}
