package com.ibrahimtkk.secondhomeworkibrahimtkk.controller;

import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.ProductCommentConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.converter.UserConverter;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.ProductCommentDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.UserDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.ProductComment;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.CommentByProductIdNotFoundException;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.CommentByUserIdNotFoundException;
import com.ibrahimtkk.secondhomeworkibrahimtkk.exception.UserNotFoundException;
import com.ibrahimtkk.secondhomeworkibrahimtkk.service.entityservice.ProductCommentEntityService;
import com.ibrahimtkk.secondhomeworkibrahimtkk.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/comments/")
public class CommentController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @GetMapping("")
    public List<ProductCommentDto> findAllComments() {

        List<ProductComment> productComments = productCommentEntityService.findAll();

        return productComments.stream()
                .map(ProductCommentConverter.INSTANCE::convertProductCommentToProductCommentDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/user/{userId}")
    public List<ProductComment> findByUsername(@PathVariable String userId) {
        List<ProductComment> productComments = productCommentEntityService.findByUserId(userId);
        if (productComments.size() == 0)
            throw new CommentByUserIdNotFoundException(userId);
        return productComments;
    }

    @GetMapping("/product/{productId}")
    public List<ProductComment> findByPhone(@PathVariable String productId) {
        List<ProductComment> productComments = productCommentEntityService.findByProductId(productId);
        if (productComments.size() == 0)
            throw new CommentByProductIdNotFoundException(productId);
        return productComments;
    }

    @PostMapping("")
    public ProductCommentDto save(@RequestBody ProductCommentDto productCommentDto) { //TODO: Input değeri dto tipinde olmalı

        productCommentDto = productCommentEntityService.save(productCommentDto);
        return productCommentDto;
    }

    @DeleteMapping("{commentId}")
    public void deleteUser(@PathVariable String commentId) {
        productCommentEntityService.deleteById(Long.valueOf(commentId));
    }

}
