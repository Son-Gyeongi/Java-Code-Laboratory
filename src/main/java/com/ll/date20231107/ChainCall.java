package com.ll.date20231107;

// 체인호출
public class ChainCall {
    public static void main(String[] args) {
        Article article = new Article();

        // 체인호출 적용 안 한 버전
        article.setTitle("Hello World!");
        article.setWriterName("Paul");
        // == 위 아래 코드 같다.
        Article article_ = article.setTitle("Hello World!");
        article_.setWriterName("Paul");

        // == 위 아래 코드 같다.
        // 체인호출 적용 한 버전
        // 앞에 article을 똑같이 쓸 때 생략할 수 있다. - 체인호출
        // 좋고 나쁜 건 없다. 개발자 취향이다.
        article
                .setTitle("Hello World!")
                .setWriterName("Paul");
    }
}

class Article extends Object {
    private String title;
    private String writerName;

    public String getTitle() {
        return title;
    }

    // 체인호출 적용 안 한 버전
    /*
    public void setTitle(String title) {
        this.title = title;
    }
     */

    // 체인호출 적용 한 버전
    public Article setTitle(String title) {
        this.title = title;

        return this; // this : 자기자신을 가리키는 리모콘
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", writerName='" + writerName + '\'' +
                '}';
    }
}

