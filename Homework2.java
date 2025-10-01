import java.util.Scanner;

public class Homework2 {
    private static final int LOOP = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student[] students = new Student[LOOP];

        for (int i = 0; i < LOOP; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int inputId = sc.nextInt();           // 학번(int)
            String inputName = sc.next();         // 이름(str)
            String inputMajor = sc.next();        // 전공(str)
            int inputPhoneInt = sc.nextInt();     // 전화번호 (int)

            students[i] = new Student(inputId, inputName, inputMajor, inputPhoneInt);
        }

        System.out.printf("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        for (int i = 0; i < LOOP; i++) {
            System.out.println( (i + 1) + "번째 학생: "
                    + students[i].getId() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + students[i].getPhone());
        }

        sc.close();
    }
}

class Student {
    // 멤버변수
    int id;
    String name;
    String major;
    int phoneInt;

    // 생성자
    public Student(int id, String name, String major, int phoneInt) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phoneInt = phoneInt;
    }

    // Getter(읽기용), Setter(쓰기용)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public String getPhone() { return phoneIntToStr(phoneInt); }
    public void setPhone(int phoneInt) { this.phoneInt = phoneInt; }

    // 전화번호 포맷팅해서 출력하는 메소드
    public String phoneIntToStr(int phoneInt) {
        String phoneStr = Integer.toString(phoneInt);

        String part1 = phoneStr.substring(0, 2);
        String part2 = phoneStr.substring(2, 6);
        String part3 = phoneStr.substring(6, 10);

        return  "0" + part1 + "-" + part2 + "-" + part3;
    }
}
