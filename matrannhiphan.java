import java.util.Scanner;
public class matrannhiphan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][3];
        int kq = 0;
        for(int i = 0; i<n; i++){
            int dem = 0;
            for(int j = 0; j<3; j++){
                g[i][j] = sc.nextInt();
                if(g[i][j] == 1) dem++;
            }
            if(dem>=2) kq++;
        }
        System.out.print(kq);
        
    }
}