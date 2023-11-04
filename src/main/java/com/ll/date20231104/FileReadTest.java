package com.ll.date20231104;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            FileReader fileReader = new FileReader("C:/techitStudy/demo20231019/filesave/"+fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
