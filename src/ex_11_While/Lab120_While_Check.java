package ex_11_While;

public class Lab120_While_Check {
    public static void main(String[] args) {
        System.out.println("The condition is always false, and nothing will print");
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;
        }
    }
}
