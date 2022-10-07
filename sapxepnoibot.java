import java.util.Scanner;
public class test3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int n1 = 0; n1<n; n1++){
                arr[n1] = sc.nextInt();
            }
            int dem = 0;
            for(int s = 0; s<n-1; s++){
                boolean check = false;
                for(int j = 0; j<n-s-1; j++){
                    if(arr[j] > arr[j+1]){
                        int x = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = x;
                        check = true;
                    }
                }
                    dem +=1;
                if(check == true){
                        System.out.format("Buoc %d:", dem);
                    for(int z=0; z<n; z++){
                        System.out.format(" %d", arr[z]);
                }
                System.out.format("%n");
                }
            }
        }
    }
