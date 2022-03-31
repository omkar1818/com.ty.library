package com.ty.library.libraryappboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.library.libraryappboot.dto.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
