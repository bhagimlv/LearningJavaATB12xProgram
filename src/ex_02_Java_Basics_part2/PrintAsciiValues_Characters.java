package ex_02_Java_Basics_part2;

public class PrintAsciiValues_Characters {

    public static void main(String[] args) {
        System.out.println("Ascii values ");
        for (int i = 0; i <100 ; i++) {
            char ch=(char)i;
            System.out.println(i + " value: "+ch);

        }
    }
}
