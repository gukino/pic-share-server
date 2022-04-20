package hku.picshare;

import hku.picshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PicShareApplication {



    public static void main(String[] args) {
        SpringApplication.run(PicShareApplication.class, args);

    }

}
