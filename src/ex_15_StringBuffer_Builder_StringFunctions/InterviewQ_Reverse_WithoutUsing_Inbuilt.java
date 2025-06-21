package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String input = "Pramod"; // domarP
        //string reverse
        for (int i= input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }

        //stringbuffer reverse
        System.out.println("");
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}
