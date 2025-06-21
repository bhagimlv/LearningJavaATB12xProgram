package ex_14_Strings;

public class Lab143_String_SubSequence {
    public static void main(String[] args) {
        //starting from 1 index to 4 but excluding the 4
        CharSequence s = "Pramod".subSequence(1,4);
        System.out.println(s);

        System.out.println("subSequence() returns a CharSequence.\n" +
                "substring() returns a String.\n" +
                "Internally, they work similarly when used on String.");

//        subSequence() returns a CharSequence.
//                substring() returns a String.
//                Internally, they work similarly when used on String.
    }
}
