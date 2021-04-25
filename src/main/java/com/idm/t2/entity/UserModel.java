package com.idm.t2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "permission")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "feature")
    private String feature;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "lastUpdateDate")
    private Date lastUpdateDate;

}
