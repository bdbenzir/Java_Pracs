public class MatMatrix {
// Sum of each matrix's row function
    static void row_sum(int A[][]) {
        System.out.println("Individual row sum");
        int i, j, sum;
        for (i = 0; i < 3; ++i) {
            sum = 0;
            for (j = 0; j < 3; ++j)
                sum = sum + A[i][j];
// Printing the row sum
            System.out.println("Sum of the " + i + " row = "+ sum);
        }
    }
// Sum of each matrix's column function
    static void column_sum(int A[][]) {
        System.out.println("\nIndividual cloumn sum");
        int i, j, sum;
        for (i = 0; i < 3; ++i) {
            sum = 0;
            for (j = 0; j < 3; ++j)
                sum = sum + A[j][i];
// Printing the column sum
            System.out.println("Sum of the " + i + " cloumn = " + sum);
        }
    }
// Matrix minor diagnol sum function
    static int minor_diagnol_sum(int A[][]) {
        int i,j, sum = 0;
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                if(i + j == 2)
                    sum = sum + A[i][j];
            }
        }
        return sum;
    }
// Matrix major diagnol sum function
    static int major_diagnol_sum(int A[][]) {
        int i,j, sum = 0;
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                if(i == j)
                    sum = sum + A[i][j];
            }
        }
        return sum;
    }
// Matrix transpose function
    static void transpose(int A[][], int B[][]) {
        System.out.println("\nMatrix transpose");
        int i, j;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                B[i][j] = A[j][i];
    }
// Matrix reverse function
    static void reverse(int A[][], int B[][]) {
        System.out.println("\nMatrix reverse");
        int i, j;
        for(i = 2; i >= 0; i--) {
            for(j = 2; j >= 0; j--)
                B[2-i][2-j] = A[i][j];
        }
    }
// Matrix printing function
    static void display(int A[][]) {
        int i, j;
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int majSum = 0, minSum = 0;
//Initialize a matrix
        int mat[][] = { { 1, 4, 7 },
                { 2, 5, 8 },
                { 3, 6, 9 } };
        int transposeMat[][] = new int[3][3];
        int reverseMat[][] = new int[3][3];
// Calculating the individual row sum of the matrix and print it
        row_sum(mat);
// Calculating the individual column sum of the matrix and print it
        column_sum(mat);
// Calculating minor diagnol sum of the matrix and store it in 'minSum'
        minSum = minor_diagnol_sum(mat);
        System.out.println("\nMinor diagnol sum: " + minSum);
// Calculating major diagnol sum of the matrix and store it in 'majSum'
        majSum = major_diagnol_sum(mat);
        System.out.println("\nMajor diagnol sum: " + majSum);
// Transpose the matrix and store it in 'transposeMat'
        transpose(mat, transposeMat);
        display(transposeMat); // After transpose, print the matrix
// Reverse the matrix and store it in 'reverseMat'
        reverse(mat, reverseMat);
        display(reverseMat); // After reverse, print the matrix
    }
}