public class MoveToShelfState extends State
{
    public  MoveToShelfState()
    {
        minutesRequiredForState = 4;
    }
    public State timeElapsed(int minutes)
    {
        minutesElapsed += minutes;

        if(minutesElapsed >= minutesRequiredForState)
        {
            return Simulation.instance().getFactory().makeTakeItemState();
        }
        return null;
    }
}
