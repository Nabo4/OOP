import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetGcd gcd = new GetGcd();

        System.out.print("최대공약수를 구할 두 양의 정수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // 재귀호출
        int recursiveRes = gcd.recursiveGcd(m, n);
        System.out.printf("재귀호출로 구한 %d와 %d의 최대공약수: %d\n", m, n, recursiveRes);

        // 반복문
        int loopRes = gcd.loopGcd(m, n);
        System.out.printf("반복문으로 구한 %d와 %d의 최대공약수: %d\n", m, n, loopRes);
    }
}


class GetGcd {
    int recursiveGcd(int m, int n) {
        if (n == 0) { return m; }   // can't divide by 0
        else if (m % n == 0) { return n; }
        else {
            m = m % n;
            return recursiveGcd(n, m);
        }
    }

    // 8, 6이면...
    int loopGcd(int m, int n) {
        if (n == 0) { return m; }   // divide by 0
        else if (m == n) { return n; }
        else {
            int res = 1;    // local variable은 초기화 필수
            for (int i = n; i >= 1; i--) {
                if ((m % i) == 0 && (n % i) == 0) {
                    res = i;
                    break;
                }
            }
            return res;
        }
    }
}
