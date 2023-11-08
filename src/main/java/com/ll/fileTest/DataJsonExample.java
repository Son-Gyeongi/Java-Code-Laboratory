package com.ll.fileTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataJsonExample {
    public static void main(String[] args) {
        String folderPath = "C:/techitStudy/demo20231019/filesave/";
        // 데이터 객체 생성
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote(1, "명언 1", "작가 1"));
        quotes.add(new Quote(2, "명언 2", "작가 2"));

        // Gson 객체 생성
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // JSON 형식으로 변환
        String jsonData = gson.toJson(quotes);

        // 파일에 저장
        try (FileWriter writer = new FileWriter(folderPath+"data.json")) {
            writer.write(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 데이터 객체 클래스
    private static class Quote {
        private int id;
        private String content;
        private String author;

        public Quote(int id, String content, String author) {
            this.id = id;
            this.content = content;
            this.author = author;
        }
    }
}
