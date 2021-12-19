package com.ibrahimtkk.secondhomeworkibrahimtkk.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String username;

}
