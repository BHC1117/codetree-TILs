import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받기
        int cnt = 1; // 초기화: 첫 줄에서 별은 1개

        for (int i = 1; i < 2 * n; i++) { // 총 2n-1 줄 출력
            for (int j = 0; j < cnt; j++) { // cnt만큼 '*' 출력
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈

            // 별 개수 조정
            if (i < n) {
                cnt++; // n번째 줄 전까지 별 개수 증가
            } else {
                cnt--; // n번째 줄 이후 별 개수 감소
            }
        }
    }
}