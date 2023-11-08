package com.ll.fileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileListReadTest {
    public static void main(String[] args) {
        String folderPath = "C:/techitStudy/demo20231019/filesave/";
        int id =0;
        List<FileTest> fileContents = new ArrayList<>();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        List<String> fileList = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getName());

                    FileTest fileTest = new FileTest(++id, file.getName(), readContentFromFile(file));
                    fileContents.add(fileTest);
                }
            }
        }

        for (String fileName : fileList) {
            System.out.println(fileName);
        }

        System.out.println("================================");

        for (int i = 0; i < fileContents.size(); i++) {
            FileTest file = fileContents.get(i);
            System.out.printf("%d / %s / %s", file.id, file.authorNmae, file.content);
        }
    }

    private static String readContentFromFile(File file) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
