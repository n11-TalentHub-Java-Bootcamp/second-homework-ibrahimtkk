package com.ibrahimtkk.secondhomeworkibrahimtkk.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Data
public class ProductCommentDto {

    private String productName;
    private String categoryName;
    private BigDecimal price;
    private UserDto user;
    private String comment;
    private Date commentDate;
    private Integer commentCount;
    private Long productId;

}
