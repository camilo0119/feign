/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutualser.feign.controller.mapper;

import com.mutualser.feign.model.entity.User;
import com.mutualser.feign.model.dto.UserDto;
import org.mapstruct.Mapper;

/**
 *
 * @author camil
 */
@Mapper
public interface IUserMapper {
    
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
    
}
