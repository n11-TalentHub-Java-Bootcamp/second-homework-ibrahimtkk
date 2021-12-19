package com.ibrahimtkk.secondhomeworkibrahimtkk.controller;

import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.UserConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.UserDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.UserNotFoundException;
import com.ibrahimtkk.secondhomeworkibrahimtkk.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("")
    public List<UserDto> findAllUsers() {

        List<User> users = userEntityService.findAll();

        return users.stream()
                .map(UserConverter.INSTANCE::convertUserToUserDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/user/{username}")
    public User findByUsername(@PathVariable String username) {
        User user = userEntityService.findByUsername(username);
        if (user == null)
            throw new UserNotFoundException("User not found by username. username: " + username);
        return user;
    }

    @GetMapping("/phone/{phone}")
    public User findByPhone(@PathVariable String phone) {
        User user = userEntityService.findByPhone(phone);
        if (user == null)
            throw new UserNotFoundException("User not found by phone. username: " + phone);
        return user;
    }

    @PostMapping("")
    public UserDto save(@RequestBody UserDto userDto) { //TODO: Input değeri dto tipinde olmalı

        userDto = userEntityService.save(userDto);
        return userDto;
    }

    @DeleteMapping("{username}/{phone}")
    public void deleteUser(@PathVariable String username, @PathVariable String phone) {
        userEntityService.deleteByUsernameAndPhone(username, phone);
    }

    @PutMapping("")
    public UserDto update(@RequestBody UserDto userDto) {//TODO: Input değeri dto tipinde olmalı
        return userEntityService.save(userDto);
    }


}
