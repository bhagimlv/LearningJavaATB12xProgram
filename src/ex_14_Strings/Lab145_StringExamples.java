package ex_14_Strings;

public class Lab145_StringExamples {
    public static void main(String[] args) {
        String s= "Java";
        char c = s.charAt(2);
        // Index = 0, ->
        System.out.println("charAt will return the character at that particular index");
        System.out.println(c);

        //it will return the unicode character
        System.out.println("codepointat  will return the unicode character");
        System.out.println(s.codePointAt(0));

        System.out.println("compareto will return the integer value- which is difference between 2 strings");
        int result = "abc".compareTo("ABC");
        System.out.println(result);
        System.out.println("comparetoIgnoreCase will return the integer value- which is difference between 2 strings");
        System.out.println("without considering the string case");
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result2);

        System.out.println("indexof will return the index of that character in a string");
        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        System.out.println("lastindexof will return the last occurence of character in a string");
        int idx2 = "Java".lastIndexOf("a"); // 3

        System.out.println("string is empty or not");
        boolean b = "".isEmpty(); // true
        System.out.println(b);

        System.out.println("String.join will join the 2 elements using delimiter");
        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);

        System.out.println("Replace the old char with the new char in string");
        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        System.out.println("startWith return boolean value if string starts with th string provided");
        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);
    }
}
