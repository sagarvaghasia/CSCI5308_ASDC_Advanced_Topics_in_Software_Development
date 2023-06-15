public class FinishedState extends State
{
    public FinishedState()
    {
        minutesRequiredForState = 0;
    }
    @Override
    public boolean isFinished()
    {
        return true;
    }
    public State timeElapsed(int minutes)
    {
        return null;
    }
}
