package hku.picshare;

import hku.picshare.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("hku.picshare.mapper")
public class PicShareApplication {



    public static void main(String[] args) {
        SpringApplication.run(PicShareApplication.class, args);
    }

}
