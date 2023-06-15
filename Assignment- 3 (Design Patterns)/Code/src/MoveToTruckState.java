public class MoveToTruckState extends State
{
    public  MoveToTruckState()
    {
        minutesRequiredForState = 4;
    }
    public State timeElapsed(int minutes)
    {
        minutesElapsed += minutes;

        if(minutesElapsed >= minutesRequiredForState)
        {
            return Simulation.instance().getFactory().makeLoadTruckState();
        }
        return null;
    }
}
