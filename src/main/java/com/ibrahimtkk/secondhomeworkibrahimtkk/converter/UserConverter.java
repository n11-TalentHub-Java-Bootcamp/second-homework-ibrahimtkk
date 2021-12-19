package com.ibrahimtkk.secondhomeworkibrahimtkk.converter;


import com.ibrahimtkk.secondhomeworkibrahimtkk.dto.UserDto;
import com.ibrahimtkk.secondhomeworkibrahimtkk.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Mapper( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User convertUserDtoToUser(UserDto userDto);

    UserDto convertUserToUserDto(User user);
}
