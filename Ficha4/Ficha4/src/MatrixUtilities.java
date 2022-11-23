public class MatrixUtilities {
    public static void show(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static boolean isMatrix(int[][] matrix) {
        int size = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (size != matrix[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix) {
        boolean value = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    value = false;
                    break;
                }

            }
        }
        return value;
    }

    public static int[][] multiplyBy(int[][] matrix, int number) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] * number;
            }
        }
           /* for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[i].length; j++) {
                    System.out.print(newMatrix[i][j]+" ");
                }
                System.out.println("");
            }*/

        return newMatrix;

    }

    public static boolean areCompatibleForSum(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][]sumOf(int[][] array1, int[][] array2){
     boolean compatible=areCompatibleForSum(array1,array2);
        int[][]newArray= new int[array1.length][array1[0].length];
     if(compatible){
         for (int i = 0; i < array1.length; i++) {
             for (int j = 0; j < array1[i].length; j++) {
                 newArray[i][j]=array1[i][j]+array2[i][j];
             }
         }
     }
     else{
         return null;
     }

    return newArray;


    }


}
