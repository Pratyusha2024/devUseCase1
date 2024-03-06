package com.usecase1.service;

import java.util.Collections;
import java.util.List;
import com.usecase1.comparators.SortByTotalMarks;
import com.usecase1.constants.StudentConstants;
import com.usecase1.model.Student;

public class StudentService {
    
    public int[] getStudentTotalHighestMarks(List<Student> records){
        int totalMarks=0;
        int[] studentHigestMarks={0,0};
        for(Student studentRec : records){
            for (int marks: studentRec.getMarks())
                totalMarks=totalMarks+marks;
            if(studentHigestMarks[0]<totalMarks){
                studentHigestMarks[0]=totalMarks;
                totalMarks=0;
                studentHigestMarks[1]=studentRec.getStudentId();
            }       
        }
        return studentHigestMarks;
    }

    public Integer[] getStudentHighestMarks(List<Student> records){
        Integer [] highestMarks={0,0,0};
        for(Student studentRec : records){
            Integer[] marks=studentRec.getMarks();
            if(marks[0]!=null && marks[0]>highestMarks[0])
                highestMarks[0]=marks[0];
            if(marks[1]!=null && marks[1]>highestMarks[1])
                highestMarks[1]=marks[1];
            if(marks[2]!=null && marks[2]>highestMarks[2])
                highestMarks[2]=marks[2];               
        }
        return highestMarks;
    }
    
    public int getStudentTotalMarks(Student student){
        int totalMarks=0;
        for(int i=0;i<student.getMarks().length;i++)
            totalMarks=totalMarks+student.getMarks()[i];
        return totalMarks;      
    }

    public int[] studentPassFailCount(Student student){
        int[] passFailCount={0,0};
        for (int i=0;i<student.getMarks().length;i++){
            if(student.getMarks()[i]!=null && student.getMarks()[i]>StudentConstants.studentPassValue)
                passFailCount[0]++;
            else
                passFailCount[1]++;
        }  
        return passFailCount;
    }

    public Student getStudentWithHigestPhysics(List<Student> records){
        Student student=null;
        int highestPhyscis=0;
        for(Student studentRec: records){
            if(studentRec.getMarks().length>0 && highestPhyscis<studentRec.getMarks()[0]){
                highestPhyscis=studentRec.getMarks()[0];
                student=studentRec;
            }
        }
        return student;
    }

    public Student getStudentWithHigestChemistry(List<Student> records){
        Student student=null;
        int highestChemistry=0;
        for(Student studentRec: records){
            if(studentRec.getMarks().length>1 && highestChemistry<studentRec.getMarks()[1]){
                highestChemistry=studentRec.getMarks()[1];
                student=studentRec;
            }
        }
        return student;
    }

    public Student getStudentWithHigestMath(List<Student> records){
        Student student=null;
        int highestMath=0;
        for(Student studentRec: records){
            if(studentRec.getMarks().length>2 && highestMath<studentRec.getMarks()[2]){
                highestMath=studentRec.getMarks()[2];
                student=studentRec;
            }
        }
        return student;
    }

    public List<Student> getStudentTotalMarksDesc(List<Student> records) {
        SortByTotalMarks sortByTotalMarks = new SortByTotalMarks();
        Collections.sort(records,sortByTotalMarks);
        return records;
    }

}
