public class IdleState extends State
{
    public IdleState()
    {
        minutesRequiredForState = 0;
    }

    public State timeElapsed(int minutes)
    {
        Shelf shelf = Simulation.instance().getShelf();
        if(shelf.getItemCount() > 0)
        {
            return Simulation.instance().getFactory().makeClaimItemState();
        }
        return Simulation.instance().getFactory().makeFinishedState();
    }

}
