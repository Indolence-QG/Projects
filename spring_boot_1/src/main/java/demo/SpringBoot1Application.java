package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("hello");
        for (String a:args) {
            System.out.println(a);
        }
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
