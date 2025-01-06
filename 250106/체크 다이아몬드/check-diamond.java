import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int cnt=1;
        for(int i=0;i<2*n-1;i++){
            if (cnt <= n) { // 윗부분 (n번째 줄까지)
                for (int j = 0; j < n - cnt; j++) {
                    System.out.print(" "); // 앞부분 공백
                }
                for (int j = 0; j < cnt; j++) {
                    System.out.print("* "); // 별 출력
                }
            } else { // 아랫부분
                for (int j = 0; j < cnt - n; j++) {
                    System.out.print(" "); // 앞부분 공백
                }
                for (int j = 0; j < 2 * n - cnt; j++) {
                    System.out.print("* "); // 별 출력
                }
            }
            System.out.println();
            cnt++;
        }
    }
}