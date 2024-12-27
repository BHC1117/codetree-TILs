import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; n > 1; i++) {
            n /= i; // n을 i로 나눔
            cnt++; // 나눗셈 횟수 증가
        }

        System.out.println(cnt);
    }

}