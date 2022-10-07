import java.util.Scanner;
public class example{
    public static int dem = 1;
}
public class so0vaso9{
    public static void khoiTaoCauHinhDauTien(int n, int[] a){
        a = new int[100];
        for(int i=1; i<=n; i++){
            a[i] = 0;
        }
    }
    public static void sinhCauHinhTiepTheo(int n, int[] a){
        int i = n;
        while(i>=1 && a[i] == 9){
            a[i] = 0;
            i--;
        }
        if(i == 0) example.dem = 0;
        else a[i] = 9;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = 1;
            int[] a = new int[10];
            int test = 0;
            int dain = 0;
            while(dain == 0){
                khoiTaoCauHinhDauTien(x, a);
                while(example.dem > 0){
                    System.out.println(test);
                    sinhCauHinhTiepTheo(x, a);
                    for(int i = 1; i<=x; i++){
                        test = test*10+a[i];
                        System.out.println(test);
                    }
                    if(test % n == 0){
                        System.out.println(test);
                        dain = 1;
                        break;
                    }
                    else test = 0;
                }
                test = 0;
                x+=1;
            }
        }
    }
}