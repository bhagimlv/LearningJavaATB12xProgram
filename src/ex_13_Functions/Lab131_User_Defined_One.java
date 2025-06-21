package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        System.out.println("sum of two numbers will be printed");
        int r1 = sum_of_two_number(4, 5);
        int r2 = sum_of_two_number(12, 45);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(sum_of_two_number(10,-1));
    }
    static int sum_of_two_number(int first, int second) {
        return first + second;
    }

}
