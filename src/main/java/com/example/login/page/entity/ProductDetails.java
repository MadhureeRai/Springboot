package com.example.login.page.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name="tbl_student")
@Entity
@Setter
@Getter
@ToString
public class ProductDetails {
    @Id
    @Column(name="sid",length = 5)
    private int id;
    private String name;
    private String address;

}
