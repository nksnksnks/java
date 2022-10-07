import java.util.Scanner;
public class sodep3{
    public static int check(String s){
        int j = s.length();
        String s0 = "";
        for(int i = 0; i< j; i++){
            int k = s.charAt(i) - '0';
            s0= s.charAt(i) + s0;
            if(k != 2 && k != 3 && k != 5 && k!=7){
                return 0;
            }
        }
        if(s.compareTo(s0) == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(check(s) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}