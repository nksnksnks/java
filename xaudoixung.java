import java.util.Scanner;
public class xaudoixung{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int ok = 0;
            int j = s.length();
            for(int i = 0; i < s.length(); i++ ){
                j--;
                if(s.charAt(i) != s.charAt(j)) ok++;
            }
            if(ok==2||s.length()%2==1&&ok==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}