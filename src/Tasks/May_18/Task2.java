package Tasks.May_18;

public class Task2 {

    public static void main(String[] args) {

//        **Task 2**
//        Guess the output:
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b; //11+22+11+22+13+24
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

//**Ouput:**
//        a=13
//        b=24
//        c=103
    }
}
