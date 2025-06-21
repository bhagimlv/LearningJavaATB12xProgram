package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {


        //  1. Step 1 ->. Find the inputs and outputs - data types and what is the exactly the out put interviewer looking.
//        2. Step 2 - **Rough logic , brute force **- > explain it side by side.
//        3. Step 3 - Write the logic and present the solution (Dry Run)
//        4. Step 4 - Optimize and discussion.
//        5. Step 5 - Edge Cases and extra discussion.
//
// Step 1 ->  Input, Output - data type -     // input -> int        // output -> String -> even or odd
        int num = -13;
        // Step 2 -> num%2 == 0 >  even else 1 odd.
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result);

        // Edge Cases
        //  -negative, float.,0, long Integer.MAX_VALUE, Integer.MIN_VALUE
    }
}
