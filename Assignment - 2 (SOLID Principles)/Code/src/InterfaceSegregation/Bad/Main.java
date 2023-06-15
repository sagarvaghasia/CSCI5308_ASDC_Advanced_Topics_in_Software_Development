
public class Main {
    public static void main(String[] args)
    {
        ICuisine cuisine = new Pizza();
        System.out.println("Preparing Pizza");
        cuisine.bakeDish();
        cuisine.prepareDrink();

        System.out.println("\n");
        ICuisine cuisine1 = new Mocktail();
        System.out.println("Preparing Mocktail");
        cuisine1.bakeDish();
        cuisine1.prepareDrink();
    }
}
