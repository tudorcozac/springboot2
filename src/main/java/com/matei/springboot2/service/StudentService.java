package com.matei.springboot2.service;

import com.matei.springboot2.dao.StudentDao;
import com.matei.springboot2.entity.Student;

import java.util.Collection;

public class StudentService {

    private StudentDao studentDao=new StudentDao();

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();

    }
}
