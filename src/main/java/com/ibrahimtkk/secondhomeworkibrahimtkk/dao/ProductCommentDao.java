package com.ibrahimtkk.secondhomeworkibrahimtkk.dao;

import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.ProductComment;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao extends CrudRepository<ProductComment, Long> {

    User findByUsername(String username);

    User findByPhone(String phone);

    Long deleteByUsernameAndPhone(String username, String phone);

}