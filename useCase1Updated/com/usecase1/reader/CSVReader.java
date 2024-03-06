package com.usecase1.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.usecase1.model.Student;

public class CSVReader implements DataReader{

    public DataReader getReader(){
        return this;
    }

    public List<Student> getRecords(){
        List<Student> records=new ArrayList<Student>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ravi PC\\Desktop\\Records.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] studentDetails = line.split(",");
                Integer[] marks={0,0,0};
                for(int i=0;i<marks.length && i+2<studentDetails.length;i++)
                    marks[i]=Integer.parseInt(studentDetails[i+2].isEmpty()?"0":studentDetails[i+2]);
                records.add(new Student(Integer.parseInt(studentDetails[0].isEmpty()?"0":studentDetails[0])
                    ,studentDetails[1],marks));
            }
        } 
        catch(IOException ioException){
            System.out.println(ioException.getStackTrace());
        }
        return records;
    }
    
}
