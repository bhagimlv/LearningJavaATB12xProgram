package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        // 1. Step 1 ->. Find the inputs and outputs - data types and what is the exactly the out put interviewer looking.
        int num1 = 2, num2 = 9, num3 = -11;
        int max;
        String message;

        // 2. Step 2 - **Rough logic , brute force means -first logic coming to mind**- > explain it side by side.
        //using max function from math
        int res=Math.max(num1,num2);
        int finalRes=Math.max(res,num3);
        System.out.println("final result using max function "+finalRes);

        System.out.println("Maximum number using ternary operator ");
        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("maximum number " + max);
        //        condition? exp1: exp2
//        3. Step 3 - Write the logic and present the solution (Dry Run)
//        4. Step 4 - Optimize and discussion.
//        5. Step 5 - Edge Cases and extra discussion.
    }
}
