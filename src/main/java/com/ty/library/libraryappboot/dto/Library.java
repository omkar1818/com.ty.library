package com.ty.library.libraryappboot.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String area;
	
	@OneToMany(mappedBy = "library")
	private List<Book> books;
	
	@OneToMany(mappedBy = "library")
	private List<Student>students;
	
	@OneToMany(mappedBy = "library")
	private List<Staff>staffs;
}
