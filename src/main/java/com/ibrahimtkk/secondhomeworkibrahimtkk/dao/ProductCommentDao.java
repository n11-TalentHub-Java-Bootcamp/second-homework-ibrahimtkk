package com.ibrahimtkk.secondhomeworkibrahimtkk.dao;

import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.ProductComment;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommentDao extends CrudRepository<ProductComment, Long> {

    List<ProductComment> findByUserId(Long userId);

    List<ProductComment> findByProductId(Long productId);

    List<ProductComment> findAll();

}