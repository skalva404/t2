package com.fetchData.t2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")

public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	Integer id;
	
	@Column(name = "NAME")
	String NAME;
	
	@Column(name = "DESCRIPTION")
	String DESCRIPTION;
	
	@Column(name = "FEATURE")
	String FEATURE;
	
	@Column(name = "TYPE")
	String TYPE;
	
	@Column(name = "STATUS")
	String STATUS;
	
	@Column(name = "CREATE_DATE")
	String CREATE_DATE;
	
	@Column(name = "LAST_UPDATE_DATE")
	String LAST_UPDATE_DATE;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getFEATURE() {
		return FEATURE;
	}

	public void setFEATURE(String fEATURE) {
		FEATURE = fEATURE;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	public String getLAST_UPDATE_DATE() {
		return LAST_UPDATE_DATE;
	}

	public void setLAST_UPDATE_DATE(String lAST_UPDATE_DATE) {
		LAST_UPDATE_DATE = lAST_UPDATE_DATE;
	}
	
	

}
