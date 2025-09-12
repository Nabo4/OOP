import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d번째 정수를 입력하세요: ", i + 1);
            /* arr[i] = sc.nextInt();
            sum += arr[i];*/
            int num = sc.nextInt();
            sum += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d 입니다.\n", sum);
        }

        /*for (int i = 0; i < 5; i++) {
            System.out.printf("arr[%d]: %d\n",  i, arr[i]);
        }*/

    }
}
