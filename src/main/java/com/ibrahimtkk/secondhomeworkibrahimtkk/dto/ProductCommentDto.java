package dto;

import entity.User;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Builder
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
