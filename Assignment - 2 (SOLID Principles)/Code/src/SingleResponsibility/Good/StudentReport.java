

public class StudentReport {

    public void printStudentReport(String reportType, Student student)
    {
        String studentName = student.getName();
        if(reportType.equalsIgnoreCase("PDF"))
        {
            System.out.println("Export Report for"+ " " +studentName+ " in PDF Format");
        }
        else if (reportType.equalsIgnoreCase("EXCEL"))
        {
            System.out.println("Export report for"+ " " +studentName+ " in EXCEL Format ");
        }
    }
}
