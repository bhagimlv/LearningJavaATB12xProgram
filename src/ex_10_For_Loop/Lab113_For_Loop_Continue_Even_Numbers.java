package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        System.out.println("Using continue print only odd numbers from the loop");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }
    }
}
