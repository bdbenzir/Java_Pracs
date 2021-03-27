import java.util.Scanner;
public class TwoDArray {
    public static int averageOfArray(int n[][]){ //For making averages.
        int sum=0, counter=0;
        for(int i=0; i<n.length; i++) { //loop by length
            for (int j=0; j<n[i].length; j++) { //nested loop for calculating the average
                sum=sum+n[i][j];
                counter++;
            }
        }
        return sum/counter; //returning average
    }
    public static int matrixMultiplication(int n[][], int avg1, int avg2, int avg3){
        int sum=0;
        for(int i=0; i<n.length; i++) { //loop by length
            for (int j=0; j<n[i].length; j++) { //nested loop for calculating the sum
                sum=sum+n[i][j];
            }
        }
        return avg1*avg2*avg3*sum; //returning multiplication with three averages
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //taking the size of all arrays
        int A[][]= new int[n][n]; //1st array
        int B[][]= new int[n][n]; //2nd array
        int C[][]= new int[n][n]; //3rd array
        System.out.println("Data of Matrix A: ");
        for(int i=0; i<n; i++){ //inputting matrix data
            for(int j=0; j<n; j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Data of Matrix B: ");
        for(int i=0; i<n; i++){ //inputting matrix data
            for(int j=0; j<n; j++){
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Data of Matrix C: ");
        for(int i=0; i<n; i++){ //inputting matrix data
            for(int j=0; j<n; j++){
                C[i][j]=sc.nextInt();
            }
        }
        int avg=averageOfArray(A); //getting average of A
        int avg1=averageOfArray(B); //getting average of B
        int avg2=averageOfArray(C); //getting average of C
        int D[][]= new int[n][n]; //another array
        System.out.println("Data of Matrix D: ");
        for(int i=0; i<n; i++){ //inputting matrix data
            for(int j=0; j<n; j++){
                D[i][j]=sc.nextInt();
            }
        }
        int multiplication=matrixMultiplication(D, avg, avg1, avg2); //multiplying D's value with three averages
        // printing averages
        System.out.println("\nAverages: ");
        System.out.println("Average of A is "+avg);
        System.out.println("Average of B is "+avg1);
        System.out.println("Average of C is "+avg2);
        //printing multiplication
        System.out.println("Multiplication is "+multiplication);
    }
}
