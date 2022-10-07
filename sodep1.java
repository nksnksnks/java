import java.util.Scanner;
public class sodep1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int test = 0;
            String s = sc.next();
            String[] words = s.split("");
            for(String word:words){
                int j = Integer.parseInt(word);
                if(j % 2 != 0){
                    System.out.println("NO");
                    test = 1;
                    break;
                }
            }
            if(test == 0){
                System.out.println("YES");
            }
            t-=1;
        }
    }
}