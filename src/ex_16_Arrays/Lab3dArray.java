package ex_16_Arrays;

public class Lab3dArray {
    public static void main(String[] args) {
        int[][][] arr_3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 12, 12}
                }
        };


        System.out.println("Element at arr[1][0][2]: " + arr_3d[1][0][2]); // Output: 9

        for (int i = 0; i < arr_3d.length; i++) {
            for (int j = 0; j < arr_3d[i].length; j++) {
                for (int k = 0; k < arr_3d[i][j].length; k++) {
                    System.out.print(arr_3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("---- End of block " + i + " ----");
        }

    }
}
