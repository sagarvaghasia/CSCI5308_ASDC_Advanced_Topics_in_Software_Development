

public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("sagar",24, "grad");
        StudentFeesCalcuate studentFeesCalcuate = new StudentFeesCalcuate();
        studentFeesCalcuate.calcuateFees(student);

        StudentReport studentReport = new StudentReport();
        studentReport.printStudentReport("PDF",student);
        student.saveStudentDetails(student,"insert");

    }
}
