import java.lang.invoke.MethodHandles;

public class ClaimItemState extends State
{
    public ClaimItemState()
    {
        minutesRequiredForState = 1;
    }
    public State timeElapsed(int minutes)
    {
        minutesElapsed += minutes;

        if(minutesElapsed >= minutesRequiredForState)
        {
            Shelf shelf = Simulation.instance().getShelf();
            if (shelf.getItemCount() > 0)
            {
                return Simulation.instance().getFactory().makeMoveToShelfState();
            }
            return Simulation.instance().getFactory().makeIdleState();
        }
        return null;
    }
}
