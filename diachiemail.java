import java.util.Scanner;
public class diachiemail{
    public static string chuanhoa(String s){
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] s0 = s.split(" ");
            String x = s0[s0.length-1];
            for(int i=0; i < s0.length-1; i++){
                x += s0[i].charAt(0);
            }
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] s = new String[t];
        String[] x = new String[t];
        for(int i = 0; i<t; i++){
            s[i] = sc.nextLine();
            x[i] = chuanhoa(s[i]);
        }
    }
}