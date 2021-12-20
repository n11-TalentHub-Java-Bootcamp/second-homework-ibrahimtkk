package com.ibrahimtkk.secondhomeworkibrahimtkk.service.entityservice;

import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.ProductCommentConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.UserConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dao.ProductCommentDao;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dao.UserDao;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.ProductCommentDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.UserDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.ProductComment;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.UserAndPhoneDoesNotMatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;

    public List<ProductComment> findAll() {
        return (List<ProductComment>) productCommentDao.findAll();
    }

    public List<ProductComment> findByUserId(String userId) {
        return productCommentDao.findByUserId(Long.valueOf(userId));
    }

    public List<ProductComment> findByProductId(String productId) {
        return productCommentDao.findByProductId(Long.valueOf(productId));
    }

    public ProductCommentDto save(ProductCommentDto productCommentDto) {
        final ProductComment productComment = productCommentDao.save(ProductCommentConverter.INSTANCE.convertProductCommentDtoToProductComment(productCommentDto));

        return ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentDto(productComment);
    }

    public void deleteById(Long id) {
        productCommentDao.deleteById(id);
    }

}