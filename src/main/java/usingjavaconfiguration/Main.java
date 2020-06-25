package usingjavaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        HelloWorld object = (HelloWorld) context.getBean("getMessage",HelloWorld.class);
        object.getMessage();
    }
}
