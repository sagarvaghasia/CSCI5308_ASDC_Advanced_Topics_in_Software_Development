

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


}
