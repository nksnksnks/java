import java.util.Scanner;
import java.lang.Math;
public class sochinhphuong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int x = (int) Math.sqrt(k);
            if(x*x == k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}