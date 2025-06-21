package ex_10_For_Loop;

import com.sun.security.jgss.GSSUtil;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {
        System.out.println("if no condition is provided in ICU , the loop will not end");
        for (int i = 0; ; i++) {
            System.out.println(i);
        }

        // exit code 130 , (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }
}
