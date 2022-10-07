import java.util.*;
import java.lang.*;
class thiSinh{
    String maTS;
    String hoTen;
    String ngaySinh;
    String diem1;
    String diem2;
    int gio;
    int phut;
    void input(Scanner sc){
        maTS = sc.next();
        sc.nextLine();
        hoTen = sc.nextLine();
        diem1 = sc.next();
        diem2 = sc.next();
        String[] vao = diem1.split(":");
        String[] ra = diem2.split(":");
        if(Integer.parseInt(ra[1]) < Integer.parseInt(vao[1])){
            phut = Integer.parseInt(ra[1]) + 60 - Integer.parseInt(vao[1]);
            gio = Integer.parseInt(ra[0]) - 1 - Integer.parseInt(vao[0]);
        }
        else{
            phut = Integer.parseInt(ra[1]) - Integer.parseInt(vao[1]);
            gio = Integer.parseInt(ra[0]) - Integer.parseInt(vao[0]);
        }

    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    void output(){
        System.out.format("%s  %s %d gio %d phut%n", maTS, hoTen, gio, phut);
    }
}
public class tinhgio{
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
        Collections.sort(tsPlus, new Comparator<thiSinh>(){
            @Override
            //lớn đến nhỏ
            public int compare(thiSinh o1, thiSinh o2){
                if(o1.getGio() > o2.getGio())
                    return -1;
                else if(o1.getGio() < o2.getGio())
                    return 1;
                else{
                    if(o1.getPhut() > o2.getPhut())
                        return -1;
                    else if(o1.getGio() < o2.getPhut())
                        return 1;
                }
                return 0;
            }
        });
        for(int i=0; i<tsPlus.size(); i++){
                (tsPlus.get(i)).output();
        }
    }
}
