package com.fetchData.t2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "permission")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "feature")
    String feature;

    @Column(name = "type")
    String type;

    @Column(name = "status")
    String status;

    @Column(name = "createDate")
    String createDate;

    @Column(name = "lastUpdateDate")
    String lastUpdateDate;

}
