package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int houseNo;
	private String colonyName;
	private String districtName;
	private String stateName;
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String colonyName, String districtName, String stateName) {
		super();
		this.houseNo = houseNo;
		this.colonyName = colonyName;
		this.districtName = districtName;
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", colonyName=" + colonyName + ", districtName=" + districtName
				+ ", stateName=" + stateName + "]";
	}
}
