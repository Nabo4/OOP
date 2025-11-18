// 메인 클래스
public class Homework7 {
    public static void main(String[] args) {
        // 문제에 주어진 main 함수 코드
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        // print()가 false를 반환할 때까지(용지가 떨어질 때까지) 반복
        while (inkjet.print());
        while (laser.print());
    }
}

// 추상 클래스 Printer 설계
abstract class Printer {
    protected String model;         // 모델명
    protected int printedCount;     // 현재까지의 출력 매수
    protected int availableCount;   // 출력 가능 매수

    // 생성자 (모델명과 초기 가용 매수 설정)
    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0; // 초기 출력 매수는 0으로 설정
    }

    // 추상 메서드 print()
    public abstract boolean print();
}

// InkjetPrinter 클래스 (Printer 상속)
class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // availableCount가 0일 경우 실패 메시지 출력 및 false 반환
        if (availableCount == 0) {
            // 실패 시 xx매는 printedCount + 1이 됨
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
        // 인쇄 성공 시 처리
        else {
            printedCount++;     // 출력 매수 증가
            availableCount--;   // 남은 매수 감소
            return true;        // 인쇄 성공
        }
    }
}

// LaserPrinter 클래스 (Printer 상속)
class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // availableCount가 0일 경우 실패 메시지 출력 및 false 반환
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
        // 인쇄 성공 시 처리
        else {
            printedCount++;     // 출력 매수 증가
            availableCount--;   // 남은 매수 감소
            return true;        // 인쇄 성공
        }
    }
}