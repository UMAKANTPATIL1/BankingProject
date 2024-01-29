package com.umakant.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="banking")
@Component
public class Banking {
	
	private int userId;
	private int userBalance;
	private String userName;
	@Id
	private int userAccount;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	public Banking(int userId, int userBalance, String userName, int userAccount) {
		super();
		this.userId = userId;
		this.userBalance = userBalance;
		this.userName = userName;
		this.userAccount = userAccount;
	}
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Banking [userId=" + userId + ", userBalance=" + userBalance + ", userName=" + userName
				+ ", userAccount=" + userAccount + "]";
	}
	

}
