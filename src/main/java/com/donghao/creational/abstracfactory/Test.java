package com.donghao.creational.abstracfactory;

public class Test {
    public static void main(String[] args) {
       CourseFactory courseFactory = new JavaCourceFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();

        article.produce();
        video.produce();
    }
}
