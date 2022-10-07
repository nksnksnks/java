import java.util.Scanner;
import java.lang.*;
public class sapxepthoigian{
    public static void swap(int x, int y){
        int s = x;
        x = y;
        y = s;
    }
    public static int xy(String s){
        String[] s1 = s.split(" ");
        int x = (Integer.parseInt(s1[0]))*3600 + (Integer.parseInt(s1[1]))*60 + (Integer.parseInt(s1[2]));
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s = new String[t];
        sc.nextLine();
        for(int i = 0; i<t; i++){
            s[i] = sc.nextLine();
        }
        int x;
        int y;
        for(int i = 0; i<t-1; i++){
            x = xy(s[i]);
            for(int j = i; j<t; j++){
                y = xy(s[j]);
                if(x > y){
                    x = y;
                    String xx = s[i];
                    s[i] = s[j];
                    s[j] = xx;
                }
            }
        }
        for(int i = 0; i<t; i++){
            System.out.println(s[i]);
        }
    }
}