import java.util.*;
import java.lang.Math;
class dem{
    static int demm = 0;
}
class items{
    String ID;
    String nameItems;
    String unit;
    int unitPrice;
    int amount;
    int feeShip;
    int price;
    int thanhTien;
    void input(Scanner sc){
        ID = setID();
        sc.nextLine();
        nameItems = sc.nextLine();
        unit = sc.next();
        unitPrice = sc.nextInt();
        amount = sc.nextInt();
        feeShip = setFeeShip();
        thanhTien = setThanhTien();
        price = setPrice();
    }
    String setID(){
        String x = "";
        dem.demm++;
        if(dem.demm < 10) x = "MH0" + String.valueOf(dem.demm);
        else x = "MH" + String.valueOf(dem.demm);
        return x;
    }
    int setFeeShip(){
        int x = Math.round(unitPrice*amount*5/100);
        return x;
    }
    int setThanhTien(){
        int x = Math.round(unitPrice*amount) + feeShip;
        return x;
    }
    int setPrice(){
        double s = (thanhTien*1.02)/amount;
        int x = (int) s;
        x = (x+99)/100*100;
        return x;

    }
    public int getPrice(){
        return price;
    }
    void output(){
        System.out.format("%s %s %s %d %d %d%n", ID, nameItems, unit, feeShip, thanhTien, price);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<items> it = new ArrayList<items>();
        for(int i = 0; i<n; i++){
            items iti = new items();
            iti.input(sc);
            it.add(iti);
        }
        Collections.sort(it, new Comparator<items>(){
            @Override
            public int compare(items o1, items o2){
                if(o1.getPrice() > o2.getPrice()) return -1;
                else if(o1.getPrice() > o2.getPrice()) return 1;
                else return 0;
            }
        });
        for(int i = 0; i<n; i++){
            (it.get(i)).output();
        }
    }
}