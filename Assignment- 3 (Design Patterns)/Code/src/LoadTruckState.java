public class LoadTruckState extends State
{
    public LoadTruckState()
    {
        minutesRequiredForState = 5;
    }
    public State timeElapsed(int minutes)
    {
        minutesElapsed += minutes;

        if(minutesElapsed >= minutesRequiredForState)
        {
            return Simulation.instance().getFactory().makeIdleState();
        }
        return null;
    }
}
