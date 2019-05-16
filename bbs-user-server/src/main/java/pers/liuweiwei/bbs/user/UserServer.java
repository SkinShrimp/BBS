package pers.liuweiwei.bbs.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.liuweiwei.bbs.user.mapper")
public class UserServer {
    public static void main(String[] args) {
        SpringApplication.run(UserServer.class);
    }
}
