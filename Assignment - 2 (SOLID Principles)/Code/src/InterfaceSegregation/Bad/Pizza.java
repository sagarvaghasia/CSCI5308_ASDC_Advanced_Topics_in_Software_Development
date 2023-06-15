

public class Pizza implements ICuisine
{

    @Override
    public void bakeDish()
    {
        System.out.println("Baking Pizza");
    }

    @Override
    public void prepareDrink()
    {
        System.out.println("Prepare Drink is a do nothing method in Pizza");
    }
}
