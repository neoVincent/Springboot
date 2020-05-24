package com.kt.demo.dao;

import com.kt.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDao {

    private final Map<UUID, Student> daatabase;

    public FakeStudentDaoImpl() {
        this.daatabase = new HashMap<>();
        UUID sid = UUID.randomUUID();
        daatabase.put(sid, new Student(sid, 14,"Alex","Monana","computer science"));
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        daatabase.put(studentId,student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return daatabase.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(daatabase.values());
    }

    @Override
    public int updateStudentById(UUID studnetId, Student newStudent) {
        daatabase.put(studnetId, newStudent);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        daatabase.remove(studentId);
        return 1;
    }
}
