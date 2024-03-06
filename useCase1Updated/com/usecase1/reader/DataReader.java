package com.usecase1.reader;

import java.util.List;
import com.usecase1.model.Student;

public interface DataReader {
    public DataReader getReader();
    public List<Student> getRecords();
}
