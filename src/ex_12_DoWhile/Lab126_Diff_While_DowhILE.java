package ex_12_DoWhile;

public class Lab126_Diff_While_DowhILE {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("while loop is not exeucting the condition failed");
        while (a < 0) {
            System.out.println(a);
            a++;
        }
        do{
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
