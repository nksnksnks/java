import java.util.Scanner;
public class tichmatran{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t0 = 1;
        while(t0 <= t){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i =0; i<n; i++){
                for(int j =0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.format("Test %d:%n", t0);
            for(int i = 0; i<n; i++){
                for(int j=0; j<n; j++){
                    int x = 0;
                    for(int z = 0; z<m; z++){
                        x+=a[i][z] * a[j][z];
                    }
                    System.out.format("%d ", x);
                }
                System.out.println();
            }
        t0++;
        }
    }
}