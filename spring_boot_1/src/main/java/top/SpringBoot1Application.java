package top;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top/indolence/mapper")
public class SpringBoot1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
