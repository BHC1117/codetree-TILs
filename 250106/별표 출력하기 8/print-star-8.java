import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.print("*");
            }else{
                for(int j=1;j<=2*i;j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                }
                
            }
            System.out.println();
        }
    }
}