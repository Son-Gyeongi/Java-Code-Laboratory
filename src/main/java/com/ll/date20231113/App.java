package com.ll.date20231113;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    int cnt = 0;
    List<Quotation> quotationList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("=== 명언 ===");

        while (true) {
            System.out.print("명령) ");

            String cmd = scanner.nextLine();
            // 종료일때는 프로그램을 종료합니다.
            if (cmd.equals("종료")) {
                break;
                // 명언일때는 명언을 등록합니다.
            } else if (cmd.equals("등록")) {
                insertQuotation();
            } else if (cmd.equals("목록")) {
                selectQuotationList();
            } else if (cmd.equals("수정")) {
                updateQuotation(cmd);
            } else if (cmd.equals("삭제")) {
                deleteQuotation(cmd);
            } else {
                System.out.println("올바른 명령어를 입력하세요.");
            }
        }
    }

    void insertQuotation() {
        Quotation quotation = new Quotation();

        System.out.print("명언: ");
        String content = scanner.nextLine();

        System.out.print("작가: ");
        String authorName = scanner.nextLine();

        cnt = cnt + 1;

        // 데이터 저장 객체에 셋팅
        quotation.setId(cnt);
        quotation.setAuthorName(authorName);
        quotation.setContent(content);

        quotationList.add(quotation);

        System.out.println(cnt + "번 명언이 등록되었습니다.");
    }

    void selectQuotationList() {
        System.out.println("=== 명언 목록 ===");

        // 순차적으로 목록 조회
        for (int i = 0; i < quotationList.size(); i++) {
            Quotation quotation = quotationList.get(i);
            System.out.println(quotation.getId() + ". " + quotation.getContent() + " (" + quotation.getAuthorName() + ")");
        }
    }

    void updateQuotation(String cmd) {
        System.out.println("=== 명언 수정 ===");
//        String idStr = cmd.replace("수정?id=", "");
        // 수정할 id를 입력받는다.
        System.out.print("몇 번 명언을 수정하시겠습니까? : ");
        String idStr = scanner.nextLine();
        int id = Integer.parseInt(idStr);

        // 명언이 존재하지 않는 id가 들어오면 "존재하지 않는 명언입니다."를 출력
        if (isExist(id)) return;

        // 실제 수정 처리
        for (int i = 0; i < quotationList.size(); i++) {
            Quotation quotation = quotationList.get(i);
            if (quotation.getId() == id) {
                System.out.println("명언(기존) : %s".formatted(quotation.getContent()));
                System.out.print("명언: ");
                String content = scanner.nextLine();

                System.out.println("작가(기존) : %s".formatted(quotation.getAuthorName()));
                System.out.print("작가: ");
                String authorName = scanner.nextLine();

                quotation.setContent(content);
                quotation.setAuthorName(authorName);

                System.out.println(id + "번 명언이 수정되었습니다.");
                return;
            }
        }
    }

    void deleteQuotation(String cmd) {
        System.out.println("=== 명언 삭제 ===");
//        String idStr = cmd.replace("삭제?id=","");
        // 삭제할 id를 입력받는다.
        System.out.print("몇 번 명언을 삭제하시겠습니까? : ");
        String idStr = scanner.nextLine();
        int id = Integer.parseInt(idStr);

        // 명언이 존재하지 않는 id가 들어오면 "존재하지 않는 명언입니다."를 출력
        if (isExist(id)) return;

        // 실제 삭제 처리
        for (int i = 0; i < quotationList.size(); i++) {
            Quotation quotation = quotationList.get(i);
            if (quotation.getId() == id) {
                quotationList.remove(i);
                System.out.println(id + "번 명언이 삭제되었습니다.");
                return;
            }
        }
    }

    // 명언이 존재하지 않는 id가 들어오면 "존재하지 않는 명언입니다."를 출력
    private boolean isExist(int id) {
        boolean isExist = false;

        for (int i = 0; i < quotationList.size(); i++) {
            Quotation quotation = quotationList.get(i);
            if (quotation.getId() == id) {
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("존재하지 않는 명언입니다.");
            return true;
        }
        return false;
    }
}
