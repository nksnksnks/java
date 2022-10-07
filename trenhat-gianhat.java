import java.util.*;
class person{
    String name;
    String date;
    void input(Scanner sc){
        name = sc.next();
        date = sc.next();
    }
    public String getDate(){
        return date;
    }
    void output(){
        System.out.format("%s", name);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        person[] ps = new person[n];
        List<person> psPlus = new ArrayList<person>();
        for(int i=0; i<n; i++){
            ps[i] = new person();
            ps[i].input(sc);
            psPlus.add(ps[i]);
        }
        double a = 0;
        double b = 2023*10000;
        int x = 0;
        int y = 0;
        Collections.sort(psPlus, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2){
                String[] x = (o1.getDate()).split("/");
                String[] y = (o2.getDate()).split("/");
                for(int i=2; i>=0; i--){
                    if(Integer.parseInt(x[i]) > Integer.parseInt(y[i])){
                        return -1;
                    }
                    else if (Integer.parseInt(x[i]) < Integer.parseInt(y[i])){
                        return 1;
                    }
                }
            }
        });
        (psPlus.get(0)).output();
        System.out.println();
        (psPlus.get(n-1)).output();
    }
}