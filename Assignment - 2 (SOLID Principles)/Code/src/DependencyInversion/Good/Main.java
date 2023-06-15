

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        ICourseFee courseFee = new CourseFee();

        ICourseOffer courseOffer = new CourseOffer();

        student.getInput();
        courseFee.coursesTotalFee(courseOffer);
    }
}
