package com.kt.demo.dao;

import com.kt.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    int insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentById(UUID studnetId, Student newStudent);

    int deleteStudentById(UUID studentId);
}
