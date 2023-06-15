

public class CourseOffer implements ICourseOffer {

    @Override
    public float offer(CourseFee courseFee) {
        int total = courseFee.getCourseFee();
        return (float)(total*(0.1));
    }
}
