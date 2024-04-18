package com.usecase1.display;

import java.util.List;
import com.usecase1.model.Student;
import com.usecase1.service.StudentService;

public class DisplayStudentDetails {
    private StudentService studentService=new StudentService();
    
    public void displayAllStudentDetails(List<Student> records){
        records.stream().forEach(System.out :: println );
    }
    
    public void displayAllStudentPassFailCount(List<Student> records){
        int physicsPassed=studentService.getPhysicsPassStudents(records).size();
        int chemistryPassed=studentService.getChemistryPassStudents(records).size();
        int mathPassed=studentService.getMathPassStudents(records).size();
        System.out.println("Total number of students passed in Physics : "+physicsPassed);
        System.out.println("Total number of students passed in Chemistry : "+chemistryPassed);
        System.out.println("Total number of students passed in Math : "+mathPassed);
        System.out.println("Total number of students failed in Physics : "+(records.size()-physicsPassed));
        System.out.println("Total number of students failed in Chemistry : "+(records.size()-chemistryPassed));
        System.out.println("Total number of students failed in Math : "+(records.size()-mathPassed));
    }
   
    public void diplayTotalHighestMarksStudent(List<Student> records){
        Student studentRec=studentService.getStudentTotalHighestMarks(records);
        System.out.println(studentRec.toString());
    }
    
    public void displayHighestMarks(List<Student> records){
        Student highestPhysics = studentService.getStudentHighestPhysicsMarks(records);
        Student highestChemistry=studentService.getStudentHighestChemistryMarks(records);
        Student highestMath=studentService.getStudentHighestMathMarks(records);
        System.out.println("Physics highest marks : "+highestPhysics.getMarks().get("Physics")+" Chemistry highest marks : "+highestChemistry.getMarks().get("Chemistry")+" Math highest marks : "+highestMath.getMarks().get("Math"));
    } 
    
    public void displayTotalMarksDescending(List<Student> records){
        List<Student> decRecords=studentService.getStudentTotalMarksDesc(records);
        System.out.println("-- Displaying Students details in descending order of total marks --");
        displayAllStudentDetails(decRecords);
    }
}
