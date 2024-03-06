import java.util.List;

import com.usecase1.display.DisplayStudentDetails;
import com.usecase1.model.Student;
import com.usecase1.reader.CSVReader;
import com.usecase1.reader.DataReader;

public class UseCase1Main{
    public static void main(String[] args) {
        DataReader reader = new CSVReader();
        List<Student> records=reader.getRecords();
        DisplayStudentDetails displayStudentDetails=new DisplayStudentDetails();
        displayStudentDetails.displayAllStudentDetails(records);
        displayStudentDetails.displayAllStudentPassFailCount(records);
        displayStudentDetails.displayHighestMarks(records);
        displayStudentDetails.diplayTotalHighestMarksStudent(records);
        displayStudentDetails.displayTotalMarksDescending(records);
    }
}