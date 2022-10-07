import java.util.Scanner;
public class souuthe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int le = 0;
            int chan = 0;
            int check = 0;
            if(s.charAt(0) == '0'){
                System.out.println("INVALID");
            }
            else{
                for(int i = 0; i<s.length(); i++){
                    if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8') chan++;
                    if(s.charAt(i) == '1' || s.charAt(i) == '3' || s.charAt(i) == '5' || s.charAt(i) == '7' || s.charAt(i) == '9') le++;
                    if(s.charAt(i) > '9' || s.charAt(i) < '0'){
                        System.out.println("INVALID");
                        check++;
                        break;
                    }
                }
                if(check == 0){
                    if((chan > le && s.length()%2==0) || (chan < le && s.length() % 2 != 0) ){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}