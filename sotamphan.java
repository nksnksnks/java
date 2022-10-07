import java.util.Scanner;
public class sotamphan{

    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();
        while(t>0){
            Long s = sc.nextLong();
            while(s > 0){
                if(s % 10 >2){
                    System.out.println("NO");
                    break;
                }
                else{
                    s=s/10;
                }
            }
            if(s == 0){
                System.out.println("YES");
            }
            t-=1;
        }
    }
}