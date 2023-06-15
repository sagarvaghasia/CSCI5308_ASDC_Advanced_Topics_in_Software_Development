public class TakeItemState extends State
{
    public TakeItemState()
    {
        minutesRequiredForState = 2;
    }

    public State timeElapsed(int minutes)
    {
        minutesElapsed += minutes;

        if(minutesElapsed >= minutesRequiredForState)
        {
            Shelf shelf = Simulation.instance().getShelf();
            shelf.claimItem();
            return Simulation.instance().getFactory().makeMoveToTruckState();
        }
        return null;
    }
}
