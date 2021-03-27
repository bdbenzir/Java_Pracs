import java.util.Scanner;

public class NotSafeAndSafe {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            boolean bed = false;
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 0) {
                    if (bed==true) {
                        bed = false;
                    }
                }
                else {
                    if (bed==true) {
                        check = false;
                        break;
                    }
                    else {
                        bed = true;
                    }
                }
            }
            if (check==false) {
                break;
            }
        }
        if (check==true)
            System.out.println("SAFE");
        else
            System.out.println("UNSAFE");
    }
}