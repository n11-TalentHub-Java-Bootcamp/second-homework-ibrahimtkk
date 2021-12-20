package com.ibrahimtkk.secondhomeworkibrahimtkk.service.entityservice;

import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.UserConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dao.UserDao;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.UserDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.UserAndPhoneDoesNotMatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentEntityService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public User findByPhone(String phone) {
        return userDao.findByPhone(phone);
    }

    public UserDto save(UserDto userDto) {
        final User user = userDao.save(UserConverter.INSTANCE.convertUserDtoToUser(userDto));

        return UserConverter.INSTANCE.convertUserToUserDto(user);
    }


    public void deleteByUsernameAndPhone(String username, String phone) {
        if (userDao.deleteByUsernameAndPhone(username, phone) == 0)
            throw new UserAndPhoneDoesNotMatchException(username + " username and "+phone+" phone does not match.");
    }

}