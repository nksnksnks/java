import java.util.Scanner;

public class snt{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int test = 0;
            double n = sc.nextDouble();
            if(n == 1 || n==4){
                System.out.println("NO");
            }
            else{
                for(int i=2; i<Math.sqrt(n); i++){
                    if(n%i==0){
                        System.out.println("NO");
                        test = 1;
                        break;
                    }
                }
                if(test == 0 && n > 1){
                    System.out.println("YES");
                }
            }
            t-=1;
        }
    }
}