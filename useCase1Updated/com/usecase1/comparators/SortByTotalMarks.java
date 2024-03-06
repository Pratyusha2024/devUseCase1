package com.usecase1.comparators;

import java.util.Comparator;

import com.usecase1.model.Student;

public class SortByTotalMarks implements Comparator<Student>{
    @Override
    public int compare(Student student1,Student student2){
        Integer student1TotalMarks=0;
        Integer student2TotalMarks=0;
        for(Integer mark : student1.getMarks())
            student1TotalMarks=student1TotalMarks+mark;
        for(Integer mark : student2.getMarks())
            student2TotalMarks=student2TotalMarks+mark;
        return student1TotalMarks-student2TotalMarks;
    }
    
}
