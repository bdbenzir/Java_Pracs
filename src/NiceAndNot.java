import java.util.Scanner;
public class NiceAndNot {
    public static int[][] makeGird(int n){
        Scanner sc = new Scanner(System.in);
        int box[][]=new int[100][100];
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                box[i][j]=sc.nextInt();
            }
        }
        return box;
    }
    public static void getMinRowArray(int[][]ara){

    }
    public static void main(String []args){
        int n;
        Scanner sc = new Scanner(System.in);
        int box[][] = new int[100][100];
        int box2[] = new int[100];
        int box3[]= new int[100];
        n=sc.nextInt();
        box=makeGird(n);
        int max=box[0][0];
        for(int i=0; i<n; i++){
            int p=i;
            max=box[i][p];
            for(int j=0; j<n; j++){
                if(max>box[p][j]){
                    max=box[p][j];
                }
            }
            box2[i]=max;
        }
        int max1= box[0][0];
        for(int i=0; i<n; i++){
            int p=i;
            max1=box[p][i];
            for (int j=0; j<n; j++){
                if(max1<box[j][p]){
                    max1=box[j][p];
                }
            }
            box2[i]=max1;
        }
        int min=box2[0];
        for(int i=1; i<n; i++){
            if(min>box2[i]){
                min=box2[i];
            }
        }
        max=box3[0];
        for(int i=1; i<n; i++){
            if(max<box3[i]){
                max=box3[i];
            }
        }
        if(max==min){
            System.out.println("Nice");
        }
        else{
            System.out.println("Not Nice");
        }
    }
}
