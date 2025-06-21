package ex_02_Java_Basics_part2;

public class Lab015_Interview_QnA_Identifying_Valid_variableNames1 {
    public static void main(String[] args) {
        //small enum is a keyword
       // int enum = 10;
        int Enum = 10;
        int a_b = 89;
//        int pramod dutta  = 89;
        int pramod$dutta = 90;
        int Lab020_Interview_QnA2 = 123;

        System.out.println("All are valid varaible names but variables containing whitespace is not valid ");
        System.out.println("Enum value "+Enum);
        System.out.println(" a_b value "+ a_b);
        System.out.println("pramod$dutta value "+pramod$dutta);
        System.out.println("Lab020_Interview_QnA2 value "+Lab020_Interview_QnA2);


    }
}
