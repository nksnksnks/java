import java.util.Scanner;
import java.math.BigInteger;
class PS{
    BigInteger a1;
    BigInteger b1;
    BigInteger a2;
    BigInteger b2;
    BigInteger ax;
    BigInteger bx;
    void input(Scanner sc){
        a1 = sc.nextBigInteger();
        b1 = sc.nextBigInteger();
        a2 = sc.nextBigInteger();
        b2 = sc.nextBigInteger();
        bx = b1.multiply(b2);
        a1 = a1.multiply(b2);
        a2 = a2.multiply(b1);
        ax = a1.add(a2);
    }
    void output(){
        System.out.print(ax.divide(ax.gcd(bx)));
        System.out.print("/");
        System.out.println(bx.divide(ax.gcd(bx)));
    }
}
public class tongphanso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PS ps = new PS();
        ps.input(sc);
        ps.output();
    }
}