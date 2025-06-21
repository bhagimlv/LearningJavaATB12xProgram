package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification1 {
    public static void main(String[] args) {
        //taking input from user
        //cli
        //scanner- popular way
        //bufferreader class -popular way
        //files as input

        //using ternary operator do the program
        String ages=args[0];
        System.out.println("cmd arguments "+ages);
        int age=Integer.parseInt(ages);

        String result= age>18? "Major":"Minor";
        System.out.println("Age result "+result);
        System.out.println("-----------------------------------");
        for(String obj: args)
        {
            int age1=Integer.parseInt(obj);
            System.out.println("cmd arguments "+age1);
            String result1= age1>18? "Major":"Minor";
            System.out.println("Age result "+result1);
        }
    }
}
