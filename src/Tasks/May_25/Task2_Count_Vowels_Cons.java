package Tasks.May_25;

import java.util.Scanner;
//2. Count vowels and consonants in a String.
public class Task2_Count_Vowels_Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        int vowelsCount = 0, consCount = 0, digitsCount = 0, spacesCount = 0, symbolsCount = 0;

        //edge cases
        if (str.trim().isEmpty()) {
            System.out.println("Empty or whitespace-only string. Please enter valid characters.");
            return;
        }
        str = str.toLowerCase();
        System.out.println("string "+str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch)>=0) {
                    vowelsCount++;
                } else {
                    consCount++;
                }
            } else if (Character.isDigit(ch)) {
                digitsCount++;
            } else if (Character.isWhitespace(ch)) {
                spacesCount++;
            } else {
                symbolsCount++;
            }

        }
        System.out.println("vowels count "+vowelsCount);
        System.out.println("consonants count "+consCount);
        System.out.println("digitsCount count "+digitsCount);
        System.out.println("spacesCount count "+spacesCount);
        System.out.println("symbolsCount count "+symbolsCount);

    }

}