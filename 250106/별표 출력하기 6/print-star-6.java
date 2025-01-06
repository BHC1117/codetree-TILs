import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int cnt=1;
        for(int i=0;i<2*n-1;i++){
            if(cnt<n){
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=2*(n-i)-1;j>0;j--){
                    System.out.print("* ");
                }
            }else{
                for(int j=2*n-(i+2);j>0;j--){
                    System.out.print("  ");
                }
                for(int j=0;j<2*(i-n+2)-1;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
            cnt++;
        }
    }
}