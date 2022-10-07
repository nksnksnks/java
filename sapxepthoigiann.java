import java.util.*;
class Time {
    private int h, m, s;
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public int getH() {
        return h;
    }
    public int getM() {
        return m;
    }
    public int getS() {
        return s;
    }
    public String toString() {
        return h + " " + m + " " + s;
    }
    
}
public class sapxepthoigiann {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Time> a = new ArrayList<>();
        int n = in.nextInt();
        while(n-->0){
            Time tmp = new Time(in.nextInt(), in.nextInt(), in.nextInt());
            a.add(tmp);
        }
        Collections.sort(a, new Comparator<Time>(){
            public int compare(Time t1, Time t2) {
                if(t1.getH() == t2.getH()){
                    if(t1.getM() == t2.getM()){
                        if(t1.getS() != t2.getS()){
                            return t1.getS() - t2.getS();
                        }
                    } else {
                        return t1.getM() - t2.getM();
                    }
                }
                return t1.getH() - t2.getH();
            }
            
        });
        for(Time x : a){
            System.out.println(x);
        }
    }
}