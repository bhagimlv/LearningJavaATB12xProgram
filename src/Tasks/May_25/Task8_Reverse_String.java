package Tasks.May_25;

import java.util.Scanner;
//8. Reverse String ( This one we have to do, when we have done the String concept)

public class Task8_Reverse_String{
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str.trim();
        String reverse="";
        if (str.isEmpty()) {
            System.out.println("Input is an empty string.");
            return;
        }
        //reverse a string
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversal of  a string is "+reverse);

    }
}
