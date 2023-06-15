

public class Main {

    public static void main (String[] args) throws Exception{

        Student student = new Student();
        CourseFee courseFee = new CourseFee();
        CourseOffer courseOffer = new CourseOffer();

        student.getInput();
        courseFee.coursesTotalFee(courseOffer);

    }
}
