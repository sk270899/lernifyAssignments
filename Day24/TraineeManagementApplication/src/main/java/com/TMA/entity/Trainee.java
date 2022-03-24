package com.TMA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springboottrainee")
public class Trainee {

	@Id
	@Column(name = "tid", length = 10)
	private int trnId;
	@Column(name = "tname", length = 15)
	private String trnName;
	@Column(name = "tsal", length = 10)
	private int trnSal;
	@Column(name = "tadd", length = 15)
	private String trnAdd;
	public int getTrnId() {
		return trnId;
	}
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	public Trainee(int trnId, String trnName, int trnSal, String trnAdd) {
		super();
		this.trnId = trnId;
		this.trnName = trnName;
		this.trnSal = trnSal;
		this.trnAdd = trnAdd;
	}

	public void setTrnId(int trnId) {
		this.trnId = trnId;
	}
	public String getTrnName() {
		return trnName;
	}
	public void setTrnName(String trnName) {
		this.trnName = trnName;
	}
	public int getTrnSal() {
		return trnSal;
	}
	public void setTrnSal(int trnSal) {
		this.trnSal = trnSal;
	}
	public String getTrnAdd() {
		return trnAdd;
	}
	public void setTrnAdd(String trnAdd) {
		this.trnAdd = trnAdd;
	}
	@Override
	public String toString() {
		return "Trainee [trnId=" + trnId + ", trnName=" + trnName + ", trnSal=" + trnSal + ", trnAdd=" + trnAdd + "]";
	}

	
	
}