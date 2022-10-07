import java.util.*;
class dem{
    static int demm = 0;
}
class vdv{
    String ID;
    int tuoi;
    String name;
    String date;
    String start;
    String finall;
    int UT;
    int thucTe;
    int xepHang;
    int xh;
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        date = sc.next();
        start = sc.next();
        finall = sc.next();
        tuoi = setTuoi();
        ID = setID();
        UT = setUT();
        thucTe = setThucTe();
        xepHang = thucTe - UT;
    }
    String setID(){
        dem.demm++;
        if(dem.demm < 10) return "VDV0" + String.valueOf(dem.demm);
        else return "VDV" + String.valueOf(dem.demm);
    }
    int setTuoi(){
        int x=0;
        x = 2021 - Integer.parseInt(date.substring(6,10));
        return x;
    }
    int setUT(){
        if(tuoi < 18) return 0;
        else if(tuoi >= 18 && tuoi <25) return 1;
        else if(tuoi >= 25 && tuoi <32) return 2;
        else return 3;
    }
    int setThucTe(){
        String[] st = start.split(":");
        String[] fi = finall.split(":");
        return Integer.parseInt(fi[0])*3600 + Integer.parseInt(fi[1])*60 + Integer.parseInt(fi[2]) - (Integer.parseInt(st[0])*3600 + Integer.parseInt(st[1])*60 + Integer.parseInt(st[2]));
    }
    void output(){
        System.out.format("%s %s ", ID, name);
        String formatted = String.format("%02d:%02d:%02d", thucTe/3600, (thucTe%3600)/60, (thucTe%60));
        System.out.format("%s 00:00:0%d ", formatted, UT);
        String formatted2 = String.format("%02d:%02d:%02d", xepHang/3600, (xepHang%3600)/60, (xepHang%60));
        System.out.format("%s %d%n", formatted2, xh);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vdv[] vdi = new vdv[n];
        List<vdv> vd = new ArrayList<vdv>();
        for(int i = 0; i<n; i++){
            vdi[i] = new vdv();
            vdi[i].input(sc);
            vd.add(vdi[i]);
        }
        Collections.sort(vd, new Comparator<vdv>(){
            @Override
            public int compare(vdv o1, vdv o2){
                if(o1.xepHang > o2.xepHang) return 1;
                else return -1;
            }
        });
        int x = 0;
        int xhh = 1;
        int check = vdi[0].xepHang;
        for(int i = 0; i<n; i++){
            if(check == vd.get(i).xepHang){
                vd.get(i).xh = xhh;
                x++;
            }
            else{
                xhh += x;
                x = 1;
                vd.get(i).xh = xhh;
                check = vd.get(i).xepHang;
            }
        }
        for(int i=0; i<n; i++){
            vdi[i].output();
        }
    }
}
