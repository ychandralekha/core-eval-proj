package com.cts.pojo;

public class CustomerDetails {
private String customerName;
private String accountType;
private String accountNumber;
private String savingsDateOfBalance;
private Integer savingsBalanceAmount;
private Integer fixedDepositAmount;
private String fixedBeginDate;
private Integer fixedTenure;
private Integer bankId;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getSavingsDateOfBalance() {
	return savingsDateOfBalance;
}
public void setSavingsDateOfBalance(String savingsDateOfBalance) {
	this.savingsDateOfBalance = savingsDateOfBalance;
}
public Integer getSavingsBalanceAmount() {
	return savingsBalanceAmount;
}
public void setSavingsBalanceAmount(Integer savingsBalanceAmount) {
	this.savingsBalanceAmount = savingsBalanceAmount;
}
public Integer getFixedDepositAmount() {
	return fixedDepositAmount;
}
public void setFixedDepositAmount(Integer fixedDepositAmount) {
	this.fixedDepositAmount = fixedDepositAmount;
}
public String getFixedBeginDate() {
	return fixedBeginDate;
}
public void setFixedBeginDate(String fixedBeginDate) {
	this.fixedBeginDate = fixedBeginDate;
}
public Integer getFixedTenure() {
	return fixedTenure;
}
public void setFixedTenure(Integer fixedTenure) {
	this.fixedTenure = fixedTenure;
}
public Integer getBankId() {
	return bankId;
}
public void setBankId(Integer bankId) {
	this.bankId = bankId;
}

public CustomerDetails(String customerName, String accountType,
		String accountNumber, String savingsDateOfBalance,
		Integer savingsBalanceAmount, Integer bankId) {
	super();
	this.customerName = customerName;
	this.accountType = accountType;
	this.accountNumber = accountNumber;
	this.savingsDateOfBalance = savingsDateOfBalance;
	this.savingsBalanceAmount = savingsBalanceAmount;
	this.bankId = bankId;
	this.fixedBeginDate="Not Applicable";
	this.fixedDepositAmount=0;
	this.fixedTenure=0;
	
}

public CustomerDetails() {
	super();
}
public CustomerDetails(String customerName, String accountType,
		String accountNumber, Integer fixedDepositAmount,
		String fixedBeginDate, Integer fixedTenure, Integer bankId) {
	super();
	this.customerName = customerName;
	this.accountType = accountType;
	this.accountNumber = accountNumber;
	this.fixedDepositAmount = fixedDepositAmount;
	this.fixedBeginDate = fixedBeginDate;
	this.fixedTenure = fixedTenure;
	this.bankId = bankId;
	this.savingsBalanceAmount=0;
	this.savingsDateOfBalance="Not Applicable";
}
@Override
public String toString() {
	return "customerName=" + customerName + ", accountType="
			+ accountType + ", accountNumber=" + accountNumber
			+ ", savingsDateOfBalance=" + savingsDateOfBalance
			+ ", savingsBalanceAmount=" + savingsBalanceAmount
			+ ", fixedDepositAmount=" + fixedDepositAmount
			+ ", fixedBeginDate=" + fixedBeginDate + ", fixedTenure="
			+ fixedTenure + ", bankId=" + bankId;
}


}
