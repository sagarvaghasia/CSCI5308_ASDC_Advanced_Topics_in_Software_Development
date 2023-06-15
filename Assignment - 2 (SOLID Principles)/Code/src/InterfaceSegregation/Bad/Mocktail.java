

public class Mocktail implements ICuisine
{

    @Override
    public void bakeDish()
    {
        System.out.println("Bake Dish is a do nothing method in mocktail");
    }

    @Override
    public void prepareDrink()
    {
        System.out.println("Preparing Drink");
    }
}
