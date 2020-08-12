package com.mutualser.feign.model.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    
    String name;
    
    String lastName;
    
    String email;
    
    String password;
    
    Integer age;
	
}