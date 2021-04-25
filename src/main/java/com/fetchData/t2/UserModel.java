package com.fetchData.t2;

import javax.persistence.*;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nAME) {
        name = nAME;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String dESCRIPTION) {
        description = dESCRIPTION;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String fEATURE) {
        feature = fEATURE;
    }

    public String getType() {
        return type;
    }

    public void setType(String tYPE) {
        type = tYPE;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String sTATUS) {
        status = sTATUS;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String cREATE_DATE) {
        createDate = cREATE_DATE;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lAST_UPDATE_DATE) {
        lastUpdateDate = lAST_UPDATE_DATE;
    }


}
