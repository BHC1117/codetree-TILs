import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1920과 2880의 최대공약수 계산
        int gcd = gcd(1920, 2880);

        // 최대공약수의 모든 약수 확인
        boolean found = false;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) { // i가 최대공약수의 약수인지 확인
                if (i >= a && i <= b) { // i가 범위 내에 있는지 확인
                    found = true;
                    break;
                }
            }
        }

        // 결과 출력
        System.out.println(found ? 1 : 0);
    }

    // 유클리드 호제법으로 최대공약수 계산
    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}