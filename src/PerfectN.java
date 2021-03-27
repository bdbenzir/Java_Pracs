import java.util.Scanner;

public class PerfectN {
    public static int isPerfect(int N){
        int sum=0, i;
        for(i = 1; i <= N/2; i++){
            if(N % i == 0){
                sum+=i;
            }
        }
        if(sum == N){
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[] args){
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        for(i = 1; i<=n; i++){
            if(isPerfect(i)==1){
                System.out.print(i+ " ");
            }
        }
    }
}
