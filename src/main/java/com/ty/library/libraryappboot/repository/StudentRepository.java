package com.ty.library.libraryappboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.library.libraryappboot.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
