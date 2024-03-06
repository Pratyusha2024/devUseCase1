package com.usecase1.display;

import java.util.List;

import com.usecase1.model.Student;
import com.usecase1.service.StudentService;

public class DisplayStudentDetails {
    private StudentService studentService=new StudentService();
    public void displayAllStudentDetails(List<Student> records){
        for(Student studentRec : records)
            System.out.println(studentRec.toString());
    }
    public void displayStudentTotalMarks(Student student){
        System.out.println(student.toString()+" Total Marks of the student : "+studentService.getStudentTotalMarks(student));
    } 
    public void displayAllStudentPassFailCount(List<Student> records){
        for(Student studentRec : records)
            System.out.println(studentRec.toString()
                +" Total subjects passed : "+studentService.studentPassFailCount(studentRec)[0]
                +" Total subjects failed : "+studentService.studentPassFailCount(studentRec)[1]);
    }
    public void diplayTotalHighestMarksStudent(List<Student> records){
        int studentID=studentService.getStudentTotalHighestMarks(records)[1];
        int highestMarks=studentService.getStudentTotalHighestMarks(records)[0];
        for(Student studentRec : records)
            if(studentRec.getStudentId()==studentID){
                System.out.println(studentRec.toString()+" Total Highest Marks: "+highestMarks);
                break;
            }
    }
   public void displayHighestMarks(List<Student> records){
        Integer[] highestMarks = studentService.getStudentHighestMarks(records);
        System.out.println("Physics highest marks : "+highestMarks[0]+" Chemistry highest marks : "+highestMarks[1]+" Math highest marks : "+highestMarks[2]);
    } 
    public void displayTotalMarksDescending(List<Student> records){
        List<Student> decRecords=studentService.getStudentTotalMarksDesc(records);
        System.out.println("-- Displaying Students details in descending order of total marks --");
        displayAllStudentDetails(decRecords);
    }
}
