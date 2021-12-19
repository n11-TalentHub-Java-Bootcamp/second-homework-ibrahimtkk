package com.ibrahimtkk.secondhomeworkibrahimtkk.dao;

import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByPhone(String phone);

    Long deleteByUsernameAndPhone(String username, String phone);

}