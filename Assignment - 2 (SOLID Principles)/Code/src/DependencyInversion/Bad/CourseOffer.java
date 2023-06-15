

public class CourseOffer {

    public float offer(CourseFee courseFee)
    {
        int total = courseFee.getCourseFee();
        return (float) (total * (0.1));
    }
}
