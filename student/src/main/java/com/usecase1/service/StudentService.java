package com.usecase1.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.usecase1.constants.StudentConstants;
import com.usecase1.model.Student;

public class StudentService {
    
    public Student getStudentTotalHighestMarks(List<Student> records){
        return records.stream().max((i,j)->i.getTotalMarks().compareTo(j.getTotalMarks())).get();
    }

    public Student getStudentHighestPhysicsMarks(List<Student> records){
        return records.stream().max((i,j)->i.getMarks().get("Physics").compareTo(j.getMarks().get("Physics"))).get();
    }

    public Student getStudentHighestChemistryMarks(List<Student> records){
        return records.stream().max((i,j)->i.getMarks().get("Chemistry").compareTo(j.getMarks().get("Chemistry"))).get();
    }

    public Student getStudentHighestMathMarks(List<Student> records){
        return records.stream().max((i,j)->i.getMarks().get("Math").compareTo(j.getMarks().get("Math"))).get();
    }
    
    public List<Student> getPhysicsPassStudents(List<Student> records){
        return records.stream().filter(x -> (x.getMarks().get("Physics") > StudentConstants.studentPassValue)).collect(Collectors.toList());
    }

    public List<Student> getMathPassStudents(List<Student> records){
        return records.stream().filter(x -> (x.getMarks().get("Math") > StudentConstants.studentPassValue)).collect(Collectors.toList());
    }

    public List<Student> getChemistryPassStudents(List<Student> records){
        return records.stream().filter(x -> (x.getMarks().get("Chemistry") > StudentConstants.studentPassValue)).collect(Collectors.toList());
    }

    public List<Student> getStudentTotalMarksDesc(List<Student> records) {
        Comparator<Student> comparator =Comparator.comparing(Student :: getTotalMarks);
        records.sort(comparator);
        return records;
    }

}
