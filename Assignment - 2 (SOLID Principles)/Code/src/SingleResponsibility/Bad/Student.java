

public class Student {
    String name;
    int age;
    String level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    Student(String name, int age, String level)
    {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public double calcuateFees(String grade)
    {
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

    public boolean saveStudentDetails(Student student, String mode)
    {
        if(mode.equalsIgnoreCase("insert"))
        {
            System.out.println("Insert details in Database");
            return true;
        }
        else
        {
            System.out.println("Update details in Database");
            return true;
        }
    }

    public void printStudentReport(String reportType)
    {
        if(reportType.equalsIgnoreCase("PDF"))
        {
            System.out.println("Export Report for " +getName() + " in PDF Format");
        }
        else if (reportType.equalsIgnoreCase("EXCEL"))
        {
            System.out.println("Export report for " +getName() + "in EXCEL Format ");
        }
    }


}
