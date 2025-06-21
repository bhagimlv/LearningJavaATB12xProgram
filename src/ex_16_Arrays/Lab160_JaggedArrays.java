package ex_16_Arrays;

public class Lab160_JaggedArrays {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };

        for (int i = 0; i < jaggedArray.length; i++) { //rows iteration
            for (int j = 0; j < jaggedArray[i].length; j++) {//columns iteration
                System.out.print(jaggedArray[i][j]+"\t");
            }
            System.out.println();

        }


    }

}
