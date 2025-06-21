package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {

        char code = 'C';
        switch (code) {
            default:
                System.out.println("Hellooooooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
        int no = 8;
        switch (no) {
            case 1, 2, 3 -> System.out.println("number is " + no);
            case 4, 5, 6 -> System.out.println("number is " + no);
            default-> System.out.println("from default");
        }

        int no1 = 2;
        switch (no1) {
            case 1, 2, 3 :
                 System.out.println("number is " + no1);
                 break;
            case 4, 5, 6 :
                System.out.println("number is " + no1);
                break;
            default: System.out.println("from default");
            break;
        }
    }
}

