package com.ll.date20231104;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaveTest {
    public static void main(String[] args) {
        String fileName = "example2.txt";
        String content = "파일에 저장될 내용입니다.2";

        try {
            FileWriter writer = new FileWriter("C:/techitStudy/demo20231019/filesave/"+fileName);
            writer.write(content);
            writer.close();
            // 코드에서 파일이 저장되는 위치는 현재 작업 디렉토리
            System.out.println("파일이 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
