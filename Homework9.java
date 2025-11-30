import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> IdPw = new HashMap<>();

        // 저장
        try {
            Scanner sc = new Scanner(new File("db.txt"));

            while (sc.hasNextLine()) {
                // line 별 처리
                String line = sc.nextLine();
                // \s 기준으로 분할
                String[] words = line.split("\\s+");
                // 2개인지 확인 후 저장
                if (words.length == 2) {
                    String id = words[0];
                    String pw = words[1];
                    IdPw.put(id, pw);
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 로그인
        while (true) {
            Scanner sc = new Scanner(System.in);
            String inputId;
            String inputPw;

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