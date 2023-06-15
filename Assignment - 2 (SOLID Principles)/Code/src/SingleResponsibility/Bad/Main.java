

public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("sagar",24, "grad");
        student.calcuateFees(student.getLevel());
        student.printStudentReport("PDF");
        student.saveStudentDetails(student,"insert");
    }
}
