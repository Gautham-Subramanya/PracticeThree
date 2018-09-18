import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the number of rows in the matrix");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int cols = in.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        System.out.println("Enter the values of Matrix 1");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the values of Matrix 2");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                matrix2[i][j] = in.nextInt();
            }
        }
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
