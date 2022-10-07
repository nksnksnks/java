import java.util.Scanner;
import java.math.BigInteger;
class phanso{
    BigInteger a, a1, b, b1, c, c1, d, d1;
    void input(Scanner sc){
        a = sc.nextBigInteger();
        a1 = sc.nextBigInteger();
        b = sc.nextBigInteger();
        b1 = sc.nextBigInteger();
    }
    void tinhtoan(){
        c = (a.multiply(b1)).add(b.multiply(a1));
        c = c.multiply(c);
        c1 = a1.multiply(b1);
        c1 = c1.multiply(c1);
        d = a.multiply(b.multiply(c));
        d1 = a1.multiply(b1.multiply(c1));
        BigInteger x, x1;
        x = d1.gcd(d);
        d = d.divide(x);
        d1 = d1.divide(x);
        x1 = c.gcd(c1);
        c = c.divide(x1);
        c1 = c1.divide(x1);
    }
    void output(){
        tinhtoan();
        System.out.print(c);
        System.out.print("/");
        System.out.print(c1);
        System.out.print(" ");
        System.out.print(d);
        System.out.print("/");
        System.out.print(d1);
    }
}
public class tinhtoanphanso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            phanso ps = new phanso();
            ps.input(sc);
            ps.output();
            System.out.println();
        }
    }
}