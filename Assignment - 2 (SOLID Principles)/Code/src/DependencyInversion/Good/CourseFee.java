

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CourseFee implements ICourseFee {
    private int courseFee;

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void coursesTotalFee(ICourseOffer courseOffer) throws IOException {
        int total = 0;
        int[] courseFee = {1000, 1000, 1000, 1000, 1000};
        List<Integer> input = new ArrayList<>();

        System.out.println("\nSelect 3 courses from the given list : ");
        System.out.println("Course No.     Course Name     Fees ");
        System.out.println("1                 DMWA         1000 CAD");
        System.out.println("2                 ASDC         1000 CAD");
        System.out.println("3                 CCSI         1000 CAD");
        System.out.println("4                 ATCC         1000 CAD");

        for(int i=0; i<3;i++)
        {
            System.out.println("Enter Course No. : ");
            int choice =Integer.parseInt(bufferedReader.readLine());


            try
            {
                if(input.contains(choice))
                {
                    System.out.println("You are not permitted to select same course again");
                }
                else
                {
                    input.add(choice);
                }
            }
            catch (Exception e)
            {
                System.out.println("You are not permitted to select same course again");
                return;
            }


            try {
                if (choice > 5 || choice < 1) throw new Exception("Enter a valid course number");
            } catch (Exception e) {
                System.out.println("\nEnter a valid course number");
                return;
            }

            total += courseFee[choice];
            setCourseFee(total);

        }

        System.out.println("After applying Offer, Net fees payable : " +(getCourseFee() - courseOffer.offer(this)) + "CAD");
    }

}
