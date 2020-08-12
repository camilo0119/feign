package com.mutualser.feign.services.impl;

import com.mutualser.feign.model.dto.UserDto;
import com.mutualser.feign.model.entity.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {
   
    public List<UserDto> listAll();
    public UserDto createUser(UserDto userDto);
    Optional<User> findById(Long id);
   
}
