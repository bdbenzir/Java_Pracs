import java.util.Scanner;
public class Qunantum_Sum {
    public static void main(String[] args){
        int n=0, i;
        float arbit=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            arbit = 1 / (i*i);
            if(i%2==0){
                sum-=arbit;
            }
            else
                sum+=arbit;
        }
        System.out.printf("Sum is %.2f", sum);
    }
}
