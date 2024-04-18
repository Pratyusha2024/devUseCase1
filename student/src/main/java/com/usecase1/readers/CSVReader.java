package com.usecase1.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                Map<String,Integer> marks=new HashMap<>();
                int totalMarks=0;
                for(int i=0;i<studentDetails.length-2 && i+2<studentDetails.length;i++){
                    if(i==0)
                        marks.put("Physics",Integer.parseInt(studentDetails[i+2].isEmpty()?"0":studentDetails[i+2]));
                    else if(i==1)
                        marks.put("Chemistry",Integer.parseInt(studentDetails[i+2].isEmpty()?"0":studentDetails[i+2]));
                    else if(i==2)
                        marks.put("Math",Integer.parseInt(studentDetails[i+2].isEmpty()?"0":studentDetails[i+2]));
                    totalMarks=totalMarks+(Integer.parseInt(studentDetails[i+2].isEmpty()?"0":studentDetails[i+2]));
                }
                records.add(new Student(Integer.parseInt(studentDetails[0].isEmpty()?"0":studentDetails[0])
                    ,studentDetails[1],marks,totalMarks));
            }
        } 
        catch(IOException ioException){
            System.out.println(ioException.getStackTrace());
        }
        return records;
    }
    
}
