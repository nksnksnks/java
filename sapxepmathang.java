import util.java.Scanner;
import util.java.Vector;
import util.java.Collections;
import util.java.Caparator;
    class mathang{
        static int id = 1;
        String maMatHang;
        String tenMatHang;
        String donViTinh;
        int giaMua;
        int giaBan;
        int loiNhuan;
    void input(Scanner sc){
        if(id < 10){
            maMatHang = "MH00";
        }
        else if(id < 100){
            maMatHang = "MH0";
        }
        else{
            maMatHang = "MH";
        }
        maMatHang += Integer.toString(id++);
        sc.nextLine();
        tenMatHang = sc.nextLine();
        donViTinh = sc.nextLine();
        giaMua = sc.nextInt();
        giaBan = sc.nextInt();
        loiNhuan = giaBan - giaMua;
    }
    void output(){
        SysTem.out.format("%s %s %s %d %d %d%n", maMatHang, tenMatHang, donViTinh, giaMua, giaBan, loiNhuan);
    }
    }
    public class sapxepmathang{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Vector<mathang> v = new Vector<>();
            for(int i = 0; i<n; i++){
                mathang x = new mathang();
                x.input(sc);
                v.add(x);
            }
            Collections.sort(v, new Comparator<mathang>(){
                @Override
                public int compare(mathang a, mathang b){
                    if (a.loiNhuan == b.loiNhuan){
                        if(a.maMatHang.compareTo(b.maMatHang) > 0){
                            return 1;
                        }
                        else{
                            return -1;
                        }
                    }
                    else if (a.loiNhuan<b.loiNhuan){
                        return 1;
                    }
                    else
                        return -1;
                }
            });
            for(int i = 0; i<n; i++){
                v.get(i).output();
            }
    }
}