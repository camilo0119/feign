package com.mutualser.feign.controller;

import com.mutualser.feign.model.dto.UserDto;
import com.mutualser.feign.services.impl.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    IUserService iUserService;
    
    @PostMapping("/create")
    public void createUser(@RequestBody final UserDto userDto) {
        iUserService.createUser(userDto);
    }
    
    @GetMapping("/list-all")
    public List<UserDto> listAllUser() {
        return iUserService.listAll();
    }
    
}
