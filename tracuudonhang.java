import java.util.*;
class donHang{
    String name;
    String maDon;
    String stt;
    long giamGia;
    long thanhTien;
    long donGia;
    long soLuong;
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        maDon = sc.next();
        donGia = sc.nextLong();
        soLuong = sc.nextLong();
        giamGia = setGiamGia();
        thanhTien = donGia*soLuong - giamGia;
        stt = setSTT();
    }
    long setGiamGia(){
        long x = 0;
        if(maDon.substring(4,5).compareTo("1") == 0) x = donGia*soLuong/2;
        else x = donGia*soLuong*3/10;
        return x;
    }
    String setSTT(){
        return maDon.substring(1,4);
    }
    void output(){
        System.out.format("%s %s %s %d %d%n", name, maDon, stt, giamGia, thanhTien);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<donHang> x = new ArrayList<donHang>();
        for(int i = 0; i<n; i++){
            donHang xi = new donHang();
            xi.input(sc);
            x.add(xi);
        }
        Collections.sort(x, new Comparator<donHang>(){
            public int compare(donHang o1, donHang o2){
                return o1.stt.compareToIgnoreCase(o2.stt);
            }
        });
        for(int i = 0; i<n; i++){
            x.get(i).output();
        }
    }
}