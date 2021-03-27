import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int N){
        boolean check = false;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                check = true;
                break;
            }
        }
        if (check == true){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers: ");
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == false) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n"+count+" prime number(s) found!");
    }
}
