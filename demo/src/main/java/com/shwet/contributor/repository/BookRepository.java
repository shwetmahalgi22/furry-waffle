package com.shwet.contributor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shwet.contributor.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitle(String title);
}
