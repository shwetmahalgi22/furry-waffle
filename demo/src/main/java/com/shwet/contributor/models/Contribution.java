package com.shwet.contributor.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "contribution")
public class Contribution {

	@Column(nullable = false)
	private Double amount;

	@Column(nullable = false)
	private String cause;
	
	@Column(nullable = false)
	private String month;

	@Column(nullable = false)
	@CreationTimestamp
	private LocalDateTime paidDate;

	@Column(nullable = false)
	private String paymentStatus;

	@Column(nullable = true)
	private String recievedBy;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transId;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String year;

	public Double getAmount() {
		return amount;
	}

	public String getCause() {
		return cause;
	}

	public String getMonth() {
		return month;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public String getRecievedBy() {
		return recievedBy;
	}

	public Long getTransId() {
		return transId;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getYear() {
		return year;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public void setRecievedBy(String recievedBy) {
		this.recievedBy = recievedBy;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
