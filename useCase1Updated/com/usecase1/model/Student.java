package com.usecase1.model;

public class Student {
    private int studentId;
    private String studentName;
    private Integer[] marks;

    public Student(int studentId,String studentName,Integer[] marks){
        this.studentId=studentId;
        this.studentName=studentName;
        this.marks=marks;
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
    public void setMarks(Integer[] marks){
        this.marks=marks;
    }
    public Integer[] getMarks(){
        return marks;
    }
    @Override
    public String toString() {
        String marks="";
        for(Integer mark : getMarks())
            marks=marks+mark+" ";
        return "StudentID : "+studentId+" StudentName : "+studentName
        +" Marks : "+marks;
    }
    
}