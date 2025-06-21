package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        boolean [] is_married_people = {true,true,false};

        System.out.println("Marks array length "+marks.length);
        System.out.println("First element in marks "+marks[0]);
        System.out.println("Fifth element in marks "+marks[4]);
//        System.out.println(marks[-1]); // //ArrayIndexOutOfBoundsException
//        System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException

        System.out.println("every character in string again converted to string ");
        char c = 'A';
        String name = "pramod";
        String[] name_each_element_char = name.split("");
        // ["p","r","o","m","d"]
        for (String str:name_each_element_char
             ) {
            System.out.println(str);
        }


    }
}
