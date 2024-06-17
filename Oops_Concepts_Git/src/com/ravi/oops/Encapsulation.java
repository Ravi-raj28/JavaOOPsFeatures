package com.ravi.oops;

public class Encapsulation {
	
	private Long msisdn;
	private String operator;
	private String simType;
	private String serviceStartDate;
	private String plan;
	private String rsmStatus;
	
	
	@Override
	public String toString() {
		return "Encapsulation [msisdn=" + msisdn + ", operator=" + operator + ", simType=" + simType
				+ ", serviceStartDate=" + serviceStartDate + ", plan=" + plan + ", rsmStatus=" + rsmStatus + "]";
	}
	
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public String getServiceStartDate() {
		return serviceStartDate;
	}
	public void setServiceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getRsmStatus() {
		return rsmStatus;
	}
	public void setRsmStatus(String rsmStatus) {
		this.rsmStatus = rsmStatus;
	}
	
	
	

}
