import java.util.*;
class sinhVien{
    String hoTen;
    String lop;
    String maSV;
    String email;
    int sortt;
    void input(Scanner sc){
        maSV = sc.next();
        sc.nextLine();
        hoTen = sc.nextLine();
        lop = sc.next();
        email = sc.next();
    }
    public String getMaSV(){
        return maSV;
    }
    void output(){
        System.out.format("%s %s %s %s%n", maSV, hoTen, lop, email);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<sinhVien> svPlus = new ArrayList<sinhVien>();
        while(sc.hasNext()){
            sinhVien sv = new sinhVien();
            sv.input();
            svPlus.add(sv);
        }
        Collections.sort(svPlus, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return (o1.getMaSV()).compareToIgnoreCase(o2.getMaSV());
        }
        });
        for(sinhVien o : svPlus){
            o.output();
        }
    }
}

