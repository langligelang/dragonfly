package com.example.demo.beans;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
@Setter
@Getter
public class User {

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "username")
    String userName;

    @Column(name = "password")
    String password;

}
