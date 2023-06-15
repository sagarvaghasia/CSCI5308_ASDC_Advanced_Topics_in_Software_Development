
public class Main {
    public static void main(String[] args)
    {
        IBakeDish bakeDish = new Pizza();
        System.out.println("Preparing Pizza");
        bakeDish.bakeDish();


        System.out.println("\n");
        IPrepareDrink prepareDrink = new Mocktail();
        System.out.println("Preparing Mocktail");
        prepareDrink.prepareDrink();
    }
}
