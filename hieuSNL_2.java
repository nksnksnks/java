import java.math.BigInteger;
import java.util.Scanner;
public class hieuSNL_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.print(a.subtract(b));
    }
}