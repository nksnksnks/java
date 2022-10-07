import java.util.Scanner;

public class testxemnao{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long sum = 0;
        long spawn = 1;
        for(int j=1; j<=a; j++){
            sum+= spawn*j;
            spawn*=j;
        }
        System.out.println(sum);
    }
}