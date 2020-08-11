package com.mutualser.feign.services.impl;

import com.mutualser.feign.model.dto.UserDto;
import com.mutualser.feign.model.entity.User;
import java.util.List;

public interface IUserService {
   
    public List<UserDto> listAll();
    public User createUser(UserDto userDto);
   
}
