package top.angeya;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: angeya
 * @Date: 2024/5/1 12:51
 * @Description: 启动类
 */
@MapperScan("top.angeya.mapper")
@SpringBootApplication
public class BadmintonCommunityApp {
    public static void main(String[] args) {
        SpringApplication.run(BadmintonCommunityApp.class, args);
    }
}
