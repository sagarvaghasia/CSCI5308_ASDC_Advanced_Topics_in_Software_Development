


public class StudentFeesCalcuate {
    public double calcuateFees(Student student)
    {
        String level = student.getLevel();
        double fees = 0.0;

        if(level=="undergrad")
        {
            fees = 1000;
        }
        else if (level=="grad")
        {
            fees = 2000;
        }
        else if (level=="phd")
        {
            fees = 3000;
        }
        System.out.println("Fees for the given level : "+fees);
        return fees;
    }
}
