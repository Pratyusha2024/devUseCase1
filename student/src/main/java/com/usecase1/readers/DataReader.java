package com.usecase1.readers;

import java.util.List;
import com.usecase1.model.Student;

public interface DataReader {
    public DataReader getReader();
    public List<Student> getRecords();
}
