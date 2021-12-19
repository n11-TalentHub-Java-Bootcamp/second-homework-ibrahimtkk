package com.ibrahimtkk.secondhomeworkibrahimtkk.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "KULLANICI")
public class User {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String name;

    @Column(name = "SOYADI", nullable = false, length = 50)
    private String surname;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "TELEFON", nullable = false, length = 15)
    private String phone;

    @Column(name = "KULLANICI_ADI", nullable = false, length = 50)
    private String username;

}
