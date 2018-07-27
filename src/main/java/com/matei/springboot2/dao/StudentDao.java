package com.matei.springboot2.dao;

import com.matei.springboot2.entity.Student;

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
}
