package com.shwet.contributor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shwet.contributor.models.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	List<Expense> findAll();
}
