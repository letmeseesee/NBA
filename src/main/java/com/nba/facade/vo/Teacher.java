package com.nba.facade.vo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private String teacherName;
    private Integer teacherAge;
    private Course course;
    private List<Student> students;
}
