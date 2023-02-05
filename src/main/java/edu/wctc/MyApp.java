package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MyApp {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        context.getBean(Report.class).create();
    }
}
