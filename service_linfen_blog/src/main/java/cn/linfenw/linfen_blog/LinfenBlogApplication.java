package cn.linfenw.linfen_blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LinfenBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinfenBlogApplication.class, args);
    }

}
