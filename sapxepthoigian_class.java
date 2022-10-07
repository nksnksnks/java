import java.util.Scanner;
import java.lang.*;
class tg{
    int gio;
    int phut;
    int giay;
    public int giayds;
    public void input(Scanner sc){
        gio = sc.nextInt();
        phut = sc.nextInt();
        giay = sc.nextInt();
        giayds = gio*3600 + phut*60 + giay;
    }
    public void output(){
        System.out.format("%d %d %d%n", gio, phut, giay);
    }
}
public class sapxepthoigian_class{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tg TGi[] = new tg[n];
        for(int i = 0; i<n; i++){
            TGi[i].input(sc);
        }
        for(int i = 0; i<n; i++){
            TGi[i].output();
        }
    }
}