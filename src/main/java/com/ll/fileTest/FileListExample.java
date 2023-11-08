package com.ll.fileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileListExample {
    public static void main(String[] args) {
        // 파일이 저장된 디렉토리 경로 지정
        String directoryPath = "C:/techitStudy/demo20231019/filesave/";

        // 디렉토리 객체 생성
        File directory = new File(directoryPath);

        // 디렉토리 내의 파일들을 배열로 얻기
        File[] files = directory.listFiles();

        // 배열을 리스트로 변환
        List<File> fileList = Arrays.asList(files);

        // 파일 내용을 저장할 리스트 생성
        List<String> fileContents = new ArrayList<>();

        // 각 파일의 내용을 읽어서 리스트에 추가
        for (File file : files) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                StringBuilder contentBuilder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    contentBuilder.append(line);
                    contentBuilder.append(System.lineSeparator());
                }

                String fileContent = contentBuilder.toString();
                fileContents.add(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 리스트 출력
        for (File file : fileList) {
            System.out.println(file.getName());
        }

        System.out.println("==========");

        // 파일 내용 출력
        for (String fileContent : fileContents) {
            System.out.println(fileContent);
        }
    }
}
