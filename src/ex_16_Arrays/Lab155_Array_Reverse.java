package ex_16_Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reverse=new int[numbers.length];
        // int[] numbers = {1, 2, 3, 4, 5};

        // 5,4,3,2,1
        for(int i=numbers.length-1,j=0;i>=0&&j < numbers.length;i--,j++){
//            for (int j = 0; j < numbers.length ; j++) {
//                reverse[j]=numbers[i];
//            }
            reverse[j]=numbers[i];
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[i]);
        }
    }
}
