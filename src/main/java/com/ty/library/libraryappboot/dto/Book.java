package com.ty.library.libraryappboot.dto;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Book {

	private int id;
	private String name;
	private String author;

	@ManyToOne
	@JoinColumn
	private Student student;
	
	@ManyToOne
	@JoinColumn
	private Library library;
}
