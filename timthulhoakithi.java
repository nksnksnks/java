import java.util.*;
import java.lang.*;
class plus{
    static int demm=0;
    static double max=0;
}
class thiSinh{
    int maTS;
    String hoTen;
    String ngaySinh;
    double diem1;
    double diem2;
    double diem3;
    double tong;
    void input(Scanner sc){
        sc.nextLine();
        hoTen = sc.nextLine();
        ngaySinh = sc.next();
        diem1 = sc.nextDouble();
        diem2 = sc.nextDouble();
        diem3 = sc.nextDouble();
        tong = diem1+diem2+diem3;
        plus.demm++;
        maTS = plus.demm;
        if (tong > plus.max) plus.max = tong;
    }
    public double getTong(){
        return tong;
    }
    void output(){
        System.out.format("%d %s %s %.1f%n", maTS, hoTen, ngaySinh, tong);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thiSinh[] ts = new thiSinh[n];
        List<thiSinh> tsPlus = new ArrayList<>();
        for(int i=0; i<n; i++){
            ts[i] = new thiSinh();
            ts[i].input(sc);
            tsPlus.add(ts[i]);
        }
        for(int i=0; i<tsPlus.size(); i++){
            if(ts[i].getTong() == plus.max){
                (tsPlus.get(i)).output();
            }
        }
    }
}
