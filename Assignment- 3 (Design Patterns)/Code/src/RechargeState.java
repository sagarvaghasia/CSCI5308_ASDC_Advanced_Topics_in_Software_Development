public class RechargeState extends State
{
    private State state;
    private IBattery battery;
    public RechargeState(State nextState, IBattery battery)
    {
        state = nextState;
        this.battery = battery;
        minutesRequiredForState = 0;
    }

    public State timeElapsed(int minutes)
    {
        this.battery.recharge(minutes);
        if(this.battery.isFullyCharged())
        {
            return state;
        }
        return null;
    }
}
