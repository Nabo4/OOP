import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("입력된 정수 중 최댓값과 최솟값을 찾아 출력합니다.\n몇 개의 정수를 입력할 예정인가요?: ");
        int count = sc.nextInt();
        int[] inputIntArr = new int[count];

        System.out.printf("정수들을 입력하세요: ");
        for (int i = 0; i < count; i++) {
            inputIntArr[i] = sc.nextInt();
        }

        searchMinMaxIntArr search = new searchMinMaxIntArr();
        int inputMax = search.getMax(inputIntArr);
        int inputMin = search.getMin(inputIntArr);

        System.out.println("최댓값: " + inputMax);
        System.out.println("최솟값: " + inputMin);
    }
}

class searchMinMaxIntArr {
    int getMax(int[] intArr) {  // int intArr[]는 C언어 형식이라고 함
        int max = intArr[0];
        for (int integer : intArr) {
            if (max < integer) { max = integer; }
        }
        return max;
    }

    int getMin(int[] intArr) {
        int min = intArr[0];
        for (int integer : intArr) {
            if (min > integer) { min = integer; }
        }
        return min;
    }
}
