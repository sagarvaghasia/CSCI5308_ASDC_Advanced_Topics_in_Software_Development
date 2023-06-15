public class BatteryPackDecorator implements IBattery
{
    private IBattery battery;

    public BatteryPackDecorator(IBattery battery){
        this.battery = battery;
    }

    @Override
    public boolean hasEnoughPowerForMinutes(int minutes)
    {
        return  battery.hasEnoughPowerForMinutes(minutes);
    }

    @Override
    public boolean isFullyCharged()
    {
        return battery.isFullyCharged();
    }

    @Override
    public void drain(int minutes)
    {
        battery.drain(minutes);
    }

    @Override
    public void recharge(int minutes)
    {
        battery.recharge(minutes);
    }
}
