import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    private int[][] matrixOne;
    private int[][] matrixTwo;
    private int[][] matrixSum;

    public int[][] getMatrixOne() {
        return matrixOne;
    }

    public void setMatrixOne(int[][] matrixOne) {
        this.matrixOne = matrixOne;
    }

    public int[][] getMatrixTwo() {
        return matrixTwo;
    }

    public void setMatrixTwo(int[][] matrixTwo) {
        this.matrixTwo = matrixTwo;
    }

    public int[][] getMatrixSum() {
        return matrixSum;
    }

    public void setMatrixSum(int[][] matrixSum) {
        this.matrixSum = matrixSum;
    }

    public static int[][] matrix(int row, int column) {
        int [][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter row " + i + " column " + j + " data");
                Scanner scan = new Scanner(System.in);
                int value = scan.nextInt();
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static int[][] matrixSum(int[][] matrixOne, int[][] matrixTwo) {
        int row = matrixOne.length;
        int column = matrixOne[0].length;
        int[][] martixSum = new int[row][column];

        for (row = 0; row < matrixOne.length; row++) {
            for (column = 0; column < matrixOne[0].length; column++) {
                martixSum[row][column] = matrixOne[row][column] + matrixTwo[row][column];
            }
        }
        return martixSum;
    }
}