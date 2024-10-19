import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int a, b;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        if(b >= a) {
            int i = b;
            while(i >= a) {
                System.out.print(i + " ");
                i--;  // 감소
            }
        }
        else {
            int i = a;
            while(i >= b) {
                System.out.print(i + " ");
                i--;  // 감소
            }
        }
    }
}