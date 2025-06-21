package Tasks.May_25;

import java.util.Scanner;
//3. Palidrome of String (chatAt())
public class Task3_Palidrome_of_String {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse="";
        //reverse a string
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("string is a palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }
}
