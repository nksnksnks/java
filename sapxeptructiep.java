import java.util.Scanner;
public class sapxeptructiep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int min;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int n1 = 0; n1<n; n1++){
                arr[n1] = sc.nextInt();
            }
            int dem = 0;
            for(int s=0; s<n-1; s++){
                for(int j = s+1; j<n; j++){
                    if(arr[s] > arr[j]){
                        int x = arr[s];
                        arr[s] = arr[j];
                        arr[j] = x;
                    }
                }
                    dem +=1;
                    System.out.format("Buoc %d:", dem);
                for(int z=0; z<n; z++){
                    System.out.format(" %d", arr[z]);
                }
                System.out.format("%n");
                }
        }
    }
    