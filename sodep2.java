import java.util.Scanner;
public class sodep2{
    public static int daucuoi(String s){
        String[] words = s.split("");
        if(Integer.parseInt(words[0]) == Integer.parseInt(words[s.length()-1]) && Integer.parseInt(words[0]) == 8){
            return 1;
        }
        return 0;
    }
    public static int muoi(String s){
        int sum = 0;
        String[] words = s.split("");
        for(String word:words){
            sum += Integer.parseInt(word);
        }
        if(sum%10==0){
            return 1;
        }
        return 0;
    }
    public static int nghichdao(String s){
        String[] words = s.split("");
        int i = 0;
        int j = s.length()-1;
        int test = 0;
        while(words[i] == words[j] && test <= s.length()/2){
            i+=1;
            j-=1;
            test += 1;
        }
        if(test == s.length()/2){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int test = 0;
            String s = sc.next();
            if(muoi(s) == 1 && daucuoi(s) == 1 && nghichdao(s) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}