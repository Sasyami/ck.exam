package ck.dz.h2;

import ck.dz.h2.controller.UserController;
import ck.dz.h2.entity.User;
import ck.dz.h2.entity.enums.Role;
import ck.dz.h2.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application {

    public static void main(String[] args) {
        var app =SpringApplication.run(H2Application.class, args);
        //app.getBean(UserService.class).addUser(new User(7L , "No","Name", Role.ADMIN));
    }

}
