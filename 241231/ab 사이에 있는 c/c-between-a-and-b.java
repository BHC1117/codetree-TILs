import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        if(a<=b){
            for(int i=1;i<=b;i++){
                if(c*i<=b){
                    System.out.print("YES");
                    break;
                }else{
                    System.out.print("NO");
                    break;
                }
            }
        }

    }
}