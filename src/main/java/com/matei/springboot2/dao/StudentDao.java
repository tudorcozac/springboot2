package com.matei.springboot2.dao;

import com.matei.springboot2.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    private static Map<Integer, Student> students = new HashMap<Integer, Student>(){
        {
            put (1, new Student(1,"tudor","mate"));
            put (2, new Student(2,"matei","info"));
            put (3, new Student(3,"andrada","farma"));
        }
    };

    public Collection<Student> getAllStudents(){
        return students.values();
    }

    public Student getStudentById(int id){
       return students.get(id);
    }

    public void deleteStudentById(int id){
        students.remove(id);
    }

    public void updateStudent(Student student){
        Student studentToUpdate = students.get(student.getId());
        studentToUpdate.setName(student.getName());
        studentToUpdate.setCourse(student.getCourse());
        students.put(student.getId(),studentToUpdate);
    }

    public void insertStudent(Student student){
        students.put(student.getId(),student);
    }
}
