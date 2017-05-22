package Porcarkum;

/**
 * Created by Armen on 4/28/2017.
 */
public class Porcarkum {
    public static void main(String[] args) {
        double [] arr1 ={1.0,2.0};
        double [] arr2 = {1,2,5,6};
        double [][] matrix  = new double[2][];
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0)
                matrix[i] = arr2;
            else
                matrix[i] = arr1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
