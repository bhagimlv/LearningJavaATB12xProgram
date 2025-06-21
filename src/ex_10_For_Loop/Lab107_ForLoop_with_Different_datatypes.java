package ex_10_For_Loop;

public class Lab107_ForLoop_with_Different_datatypes {
    public static void main(String[] args) {

        System.out.println("byte values");
        for (byte i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("short values");
        for (short i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Integer values");
        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("long values");
        for (long l = 7l; l < 10l; l++) {
            System.out.println("Hi,long -> " + l);
        }
        System.out.println("Float values");
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
        System.out.println("double values");
        for (double d = 7.9; d < 10; d++) {
            System.out.println("Hi,double -> " + d);
        }

        System.out.println("print characters values 1 to 10");
        for(char c=65;c<=100;c++)
        {
            System.out.println("character value "+c);
        }

    }
}
