

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Student
{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void getInput() throws Exception
    {
        System.out.println("Enter Student Name : ");
        setName(bufferedReader.readLine());

        System.out.println("Enter Student Password : ");
        setPassword(bufferedReader.readLine());

        try
        {
            if(isStudentValid(name,password))
            {
                System.out.println("\nName : " +getName() +"\nPassword:" +getPassword());
            }
            else {
                throw new Exception("Enter Valid Student Name and Student Password");
            }
        }
        catch (Exception e)
        {
            System.out.println("Enter Valid Student Name and Student Password");
            System.exit(0);
        }

    }

    public boolean isStudentValid(String name, String password)
    {
        return !name.equals("") &&
                !password.equals("") &&
                name.matches("^[a-zA-Z]*$") &&
                password.matches("^[a-zA-Z]*$");
    }
}
