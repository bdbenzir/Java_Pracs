import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Interger: ");
        int t = sc.nextInt();
        switch(t%2){
            case 0:
            System.out.println("It's even");
            break;
            case 1:
            System.out.println("It's odd");
        }
    }
}
