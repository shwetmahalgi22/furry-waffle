package com.shwet.contributor.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {

	@Column(nullable = false)
	private LocalDateTime createdTs;

	@Column(nullable = false)
	private double expAmount;

	@Column(nullable = false)
	private LocalDate expDate;

	@Column(nullable = false)
	private String expDescription;

	@Column(nullable = false)
	private String expenseFor;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long expenseId;

	@Column(nullable = false)
	private String expenseOwner;

	public LocalDateTime getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(LocalDateTime createdTs) {
		this.createdTs = createdTs;
	}

	public double getExpAmount() {
		return expAmount;
	}

	public void setExpAmount(double expAmount) {
		this.expAmount = expAmount;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getExpDescription() {
		return expDescription;
	}

	public void setExpDescription(String expDescription) {
		this.expDescription = expDescription;
	}

	public String getExpenseFor() {
		return expenseFor;
	}

	public void setExpenseFor(String expenseFor) {
		this.expenseFor = expenseFor;
	}

	public long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseOwner() {
		return expenseOwner;
	}

	public void setExpenseOwner(String expenseOwner) {
		this.expenseOwner = expenseOwner;
	}

}
