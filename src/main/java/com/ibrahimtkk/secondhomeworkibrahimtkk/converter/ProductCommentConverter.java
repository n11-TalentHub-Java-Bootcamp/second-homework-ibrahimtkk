package com.ibrahimtkk.secondhomeworkibrahimtkk.converter;


import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.ProductCommentDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Mapper( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface ProductCommentConverter {

    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    ProductComment convertProductCommentDtoToProductComment(ProductCommentDto productCommentDto);

    ProductCommentDto convertProductCommentToProductCommentDto(ProductComment productComment);
}
