import java.util.Scanner;
public class xaunhiphan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] x = new String[93];
            x[1] = "0";
            x[2] = "1";
            for(int i = 3; i<=n; i++){
                x[i] = x[i-2] + x[i-1];
            }
            if(k <= x[n].length()){
                System.out.println(x[n].charAt(k-1));
            }
        }
        
    }
}