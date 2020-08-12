package com.mutualser.feign.controller;

import com.mutualser.feign.model.dto.UserDto;
import com.mutualser.feign.model.entity.User;
import com.mutualser.feign.services.impl.IUserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public UserDto createUser(@RequestBody final UserDto userDto) {
        return iUserService.createUser(userDto);
    }
    
    @GetMapping("/list-all")
    public List<UserDto> listAllUser() {
        return iUserService.listAll();
    }
    
    @GetMapping("findById/{id}")
    public Optional<User> listById(@PathVariable("id") Long id) {
        return iUserService.findById(id);
    }
    
}
