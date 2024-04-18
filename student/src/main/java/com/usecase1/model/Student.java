package com.usecase1.model;

import java.util.Map;

public class Student {
    private int studentId;
    private String studentName;
    private Map<String,Integer> marks;
    private Integer totalMarks;

    public Student(){}
    
    public Student(int studentId,String studentName,Map<String,Integer> marks,Integer totalMarks){
        this.studentId=studentId;
        this.studentName=studentName;
        this.marks=marks;
        this.totalMarks=totalMarks;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setMarks(Map<String,Integer> marks){
        this.marks=marks;
    }
    public Map<String,Integer> getMarks(){
        return marks;
    }
    public void setTotalMarks(Integer totalMarks){
        this.totalMarks=totalMarks;
    }
    public Integer getTotalMarks(){
        return totalMarks;
    }

    @Override
    public String toString() {
        return "StudentID : "+studentId+" StudentName : "+studentName
        +" Marks : "+marks.toString()+" TotalMarks : "+totalMarks;
    }
    
}