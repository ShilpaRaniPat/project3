
import java.util.InputMismatchException;
import java.util.Scanner;

public class matrixAddition {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        try {
            System.out.println("Please enter number of rows and column for matrix one");
            System.out.println("Number of rows:");
            Scanner rowScan = new Scanner(System.in);
            int row = rowScan.nextInt();
            System.out.println("Number of columns:");
            Scanner columnScan = new Scanner(System.in);
            int column = columnScan.nextInt();

            System.out.println("Please enter number of rows and column for matrix two");
            int a = 0;
            while (a == 0) {
                System.out.println("Number of rows:");
                Scanner rowScanTwo = new Scanner(System.in);
                int rowTwo = rowScanTwo.nextInt();
                try {
                    if (rowTwo != row) {
                        throw new notValidMatrixToFindSum("row of matrix one did not matched matrix two.");
                    } else {
                        a++;
                    }
                }catch (notValidMatrixToFindSum invalidMatrix) {
                    System.out.println(invalidMatrix.getMessage());
                }
            }
            while (a == 1) {
                System.out.println("Number of columns:");
                Scanner rowScanTwo = new Scanner(System.in);
                int rowTwo = rowScanTwo.nextInt();
                try {
                    if (rowTwo != row) {
                        throw new notValidMatrixToFindSum("column of matrix one did not matched matrix two.");
                    } else {
                        a++;
                    }
                }catch (notValidMatrixToFindSum invalidMatrix) {
                    System.out.println(invalidMatrix.getMessage());
                }
            }
            matrix.setMatrixOne(matrix.matrix(row, column));
            matrix.setMatrixTwo(matrix.matrix(row, column));
            matrix.setMatrixSum(matrix.matrixSum(matrix.getMatrixOne(), matrix.getMatrixTwo()));
            int[][] matrixSum = matrix.getMatrixSum();
            for (int i = 0; i < matrixSum.length; i++) {
                for (int j = 0; j < matrixSum[i].length; j++) {
                    System.out.print(matrixSum[i][j] + "   ");
                }
                System.out.println();
            }
        }catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}

class notValidMatrixToFindSum extends Exception {
    public notValidMatrixToFindSum(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}





