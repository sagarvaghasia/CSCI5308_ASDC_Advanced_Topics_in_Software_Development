public class BatteryPack extends BatteryPackDecorator
{
    private IBattery battery;

    public BatteryPack(IBattery battery, IBattery batteryPack)
    {
        super(battery);
        this.battery = batteryPack;
    }

    @Override
    public boolean hasEnoughPowerForMinutes(int minutes)
    {
        return this.battery.hasEnoughPowerForMinutes(minutes) || super.hasEnoughPowerForMinutes(minutes);
    }

    @Override
    public boolean isFullyCharged()
    {
        return battery.isFullyCharged() && super.isFullyCharged();
    }

    @Override
    public void drain(int minutes)
    {
        if(this.battery.hasEnoughPowerForMinutes(minutes))
        {
            this.battery.drain(minutes);
            return;
        }
        super.drain(minutes);
    }

    @Override
    public void recharge(int minutes)
    {
        if(super.isFullyCharged() == false)
        {
            super.recharge(minutes);
            return;
        }
        this.battery.recharge(minutes);
    }
}
