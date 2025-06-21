package ex_06_Ternary_Operator;

public class Lab062_Ternary_Operator {
    public static void main(String[] args) {
        //  ? :
        int age = 27;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";
        System.out.println("Ternary operator result- whether user is able to goa or not:  "+canIGoTOGoa);
    }
}
