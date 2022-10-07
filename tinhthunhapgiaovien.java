import java.util.Scanner;
class GiaoVien{
    String maNgach;
    String hoTen;
    int HSLuong;
    int phuCap;
    int luongCB;
    int thuNhap;
    void input(){
        Scanner sc = new Scanner(System.in);
        maNgach = sc.nextLine();
        hoTen = sc.nextLine();
        luongCB = sc.nextInt();
        if(maNgach.substring(0,2).compareTo("HT") == 0){
            phuCap = 2000000;
        }
        if(maNgach.substring(0,2).compareTo("HP") == 0){
            phuCap = 900000;
        }
        if(maNgach.substring(0,2).compareTo("GV") == 0){
            phuCap = 500000;
        }
        HSLuong = (maNgach.charAt(2) - '0')*10 + (maNgach.charAt(3) - '0');
        thuNhap = luongCB*HSLuong + phuCap;
    }
    void output(){
        System.out.format("%s %s %d %d %d", maNgach, hoTen, HSLuong, phuCap, thuNhap);
    }
}
public class tinhthunhapgiaovien{
    public static void main(String[] args){
        GiaoVien gv = new GiaoVien();
        gv.input();
        gv.output();
    }
}