package com.mutualser.feign.services;

import com.mutualser.feign.controller.mapper.IUserMapper;
import com.mutualser.feign.model.dto.UserDto;
import com.mutualser.feign.model.entity.User;
import com.mutualser.feign.repository.UserRepository;
import com.mutualser.feign.services.impl.IUserService;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    
    IUserMapper iUserMapper = Mappers.getMapper(IUserMapper.class);
    
    @Override
    public List<UserDto> listAll() {
        List<User> listUser = userRepository.findAll();
        List<UserDto> listUserDto = new ArrayList();
        for (User u: listUser) {
            UserDto userDto = iUserMapper.toDto(u);
            listUserDto.add(userDto);
        }
        return listUserDto;
    }

    @Override
    public User createUser(UserDto userDto) {
        User user = iUserMapper.toEntity(userDto);
        userRepository.save(user);
        return user;
    }
    
}
