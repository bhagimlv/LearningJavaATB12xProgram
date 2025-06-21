package ex_03_Literals;

public class Lab029_Char_Literals_Escape_Characters
{
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Normal text using escape characters ");
        System.out.println("Hi Java");

        System.out.println("Take new line in between hi and java");
        System.out.println("Hi"+new_line+"Java");
        System.out.println("Hi\nJava");

        System.out.println("Take tab in between hi and java");
        System.out.println("Hi"+tab_line+"Java");

        System.out.println("Take backspace in between hi and java");
        System.out.println("Hi"+back_space+"Java");
        System.out.println( " ----- ");

        System.out.println("Pramod is "+carriage_return+"Dutta");
        System.out.println( " ----- ");
        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        System.out.println("c10 value "+c10);
        //  // ASCII, (limited numbers) - A -> 65
        char ruppes = '₹';
        System.out.println("Ruppes values "+ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println("my_laugh_smily value "+my_laugh_smily);
        char c11  = '\u1F60';
        System.out.println("c11 value "+c11);

    }
}