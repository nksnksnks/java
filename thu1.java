import java.util.Scanner;

public class thu1{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n =  sc.nextInt();
            long x = 0;
            long a = 0;
            long b = 1;
            long c = 1;
            for(int i=1; i<n; i++){
                x = a + b;
                a = b;
                b = x;
            }
            System.out.println(x);
            t-=1;
        }
    }
}