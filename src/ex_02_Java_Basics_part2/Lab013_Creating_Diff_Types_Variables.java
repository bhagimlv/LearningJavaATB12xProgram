package ex_02_Java_Basics_part2;

public class Lab013_Creating_Diff_Types_Variables
{
    public static  void main(String args[])
    {
        // Creating variables will follow the identifier rules
        System.out.println("Names can contain letters, digits, underscores, and dollar signs.");
        System.out.println("Names must begin with a letter.");
        System.out.println("Names should start with a lowercase letter, and cannot contain whitespace.");
        System.out.println("Names can also begin with $ and _");
        System.out.println("Names are case-sensitive (\"myVar\" and \"myvar\" are different variables)");

        //int _ = 65;
        int _$=89;
        int $ = 65;
        int year = 2025;
        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 89;

        System.out.println("_$ value "+_$);
        System.out.println("$ value "+$);
        System.out.println("year value "+year);
        System.out.println("this_is_a_vari_long_name_in_the_class_hello_$_akakak "+this_is_a_vari_long_name_in_the_class_hello_$_akakak);

   }
}
