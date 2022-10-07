import java.util.Scanner;

public class tinhtong
{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0){
                long S=0;
                long n = sc.nextLong();
                if(n%2!=0){
                    S = (n+1)*(n/2)+(n+1)/2;
                }
                else{
                    S = (n+1)*(n/2);
                }
                t-=1;
                System.out.println(S);
            }
    }
}