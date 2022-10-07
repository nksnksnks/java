import java.util.*;
class dem{
    static int demm;
}
class personnel{
    String ID;
    String name;
    String chucVu;
    int luongCB;
    int soNgayCong;
    int luong;
    int tamUng;
    int phuCap;
    int conLai;
    int thuNhap;
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        chucVu = sc.next();
        luongCB = sc.nextInt();
        soNgayCong = sc.nextInt();
        luong = (luongCB*soNgayCong);
        ID = setID();
        phuCap = setPhuCap();
        tamUng = setTamUng();
        conLai = luong - tamUng + phuCap;
        thuNhap = phuCap + luong;
    }
    String setID(){
        dem.demm++;
        String x = "";
        if(dem.demm<10) x = "NV0" + String.valueOf(dem.demm);
        else x = "NV" + String.valueOf(dem.demm);
        return x;
    }
    int setPhuCap(){
        String x = chucVu + "xxxxxxx";
        if(x.substring(0,2).compareTo("GD") == 0) return 500;
        else if(x.substring(0,3).compareTo("PGD") == 0) return 400;
        else if(x.substring(0,2).compareTo("TP") == 0) return 300;
        else if(x.substring(0,2).compareTo("KT") == 0) return 250;
        else return 100;
    }
    String getChucVu(){
        String x = chucVu + "xxxxxxx";
        return x;
    }
    int setTamUng(){
        int x = ((phuCap + luong)*2/3);
        if(x < 25000) return ((phuCap + luong)*2/3+500)/1000*1000;
        else return 25000;
    }
    void output(){
        System.out.format("%s %s %d %d %d %d%n", ID, name, phuCap, luong, tamUng, conLai);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<personnel> ps = new ArrayList<personnel>(); 
        for(int i =0; i<n; i++){
            personnel psi = new personnel();
            psi.input(sc);
            ps.add(psi);
        }
        Collections.sort(ps, new Comparator<personnel>(){
            @Override
            public int compare(personnel o1, personnel o2){
                if(o1.thuNhap > o2.thuNhap) return -1;
                else if(o1.thuNhap < o2.thuNhap) return 1;
                else{
                    return (o1.ID).compareToIgnoreCase(o2.ID);
                }
            }
        });
        for(int i =0; i<n; i++){
            ps.get(i).output();
        }
    }
}
