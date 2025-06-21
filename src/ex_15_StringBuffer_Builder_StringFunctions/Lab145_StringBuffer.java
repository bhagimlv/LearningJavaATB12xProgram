package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println("In String buffer No need to assign the modified string to another string variable");
        System.out.println(stringBuffer);

        System.out.println("In Strings Need to assign the modified string to another string variable");
        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1);
    }
}
