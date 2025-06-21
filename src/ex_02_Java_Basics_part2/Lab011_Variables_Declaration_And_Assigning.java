package ex_02_Java_Basics_part2;

public class Lab011_Variables_Declaration_And_Assigning {
    public static  void main(String args[])
    {
        // data_type variable_name =  variable_value
        byte age = 65;
//      short age = 65;
        // byte -> data type - type of container
        //  age ->  variable_name |  identifier
        // = -> Assignment Operator
        // 65 -> Variable Value |  Literal
        System.out.println("Recent assigned value will printed");
        age = 66;
        System.out.println(age);
    }
}
