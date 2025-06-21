package Tasks.May_17;

//If my age is greater than 18, then I can be minor or adult or senior.
//        But if my age is greater than 65, then I am a senior.
//        If I am between 18 to 65, then I am an adult.

import java.util.Scanner;

public class Task3_Ternary_Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of a person ");
        if(!sc.hasNextInt())
        {
            System.out.println("enter only valid age in integers ");
            return;
        }
        int age= sc.nextInt();
        if(age<=0)
        {
            System.out.println("age is not valid");
            return;
        }

        String result=(age>0 && age<=18 ) ? "MINOR" : (age>18 && age<65 ? "ADULT":"SENIOR" );
        System.out.println("User is "+result);

    }
}
