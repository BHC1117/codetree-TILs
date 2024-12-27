import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int b=(i/8)%2;
            int c=i%7;
            if(i%2==0&&i%4!=0){
                continue;
            }
            if(b==0){
                continue;
            }
            if(c<4){
                continue;
            }
                
                System.out.print(i+" ");
            }
        }
    }
