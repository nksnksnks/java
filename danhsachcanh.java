import java.util.Scanner;
public class danhsachcanh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                g[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                if(g[i][j] == 1){
                    System.out.format("(%d,%d)%n", i, j);
                }
            }
        }
    }
}