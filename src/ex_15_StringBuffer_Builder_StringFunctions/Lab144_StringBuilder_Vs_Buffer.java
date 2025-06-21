package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%-used
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println("stringBuffer "+stringBuffer);
        System.out.println("stringBuilder "+stringBuilder);
        System.out.println("stringBuffer.reverse() "+stringBuffer.reverse());
        System.out.println("stringBuilder.reverse() "+stringBuilder.reverse());
    }
}
