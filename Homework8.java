import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> IdPw = new HashMap<>();
        IdPw.put("myId", "myPass");
        IdPw.put("myId2", "myPass2");
        IdPw.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        String inputId;
        String inputPw;

        while (true) {
            // id 입력
            System.out.printf("id와 password를 입력해주세요.\nid: ");
            inputId = sc.nextLine().trim();

            // id 존재X
            if (!IdPw.containsKey(inputId)) {
                System.out.printf("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
                continue;
            }

            // pw 입력
            System.out.printf("password: ");
            inputPw = sc.nextLine().trim();

            // pw 일치X
            if (!IdPw.get(inputId).equals(inputPw)) {
                System.out.printf("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}