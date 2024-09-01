package ck.dz.h2.controller;

import ck.dz.h2.dto.ServiceAddUserResponse;
import ck.dz.h2.dto.ServiceGetCountryNotResponse;
import ck.dz.h2.entity.User;
import ck.dz.h2.entity.enums.Country;
import ck.dz.h2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-api/v1")
public class UserController {
    private final UserService userService;
    @GetMapping("/users")
    public List<User> g(){

        return userService.findAll();

    }
    @PostMapping("/users")
    public ServiceAddUserResponse addUser(@RequestBody User us){

        User user = userService.addUser(us);

        if (userService.findById(user.getUser_id()).isPresent()){
            return ServiceAddUserResponse
                    .builder()
                    .code(0)
                    .message("Entity added")
                    .build();
        }else{
            return ServiceAddUserResponse.builder()
                    .code(-1)
                    .message("Failed to add entity")
                    .build();
        }

    }
    @GetMapping("/additional-info")
    public ServiceGetCountryNotResponse getCountry(@RequestParam(value="country") Country country){
        return ServiceGetCountryNotResponse.builder().users(userService.findByNotCountry(country)).message("Ок").build();

    }

}
