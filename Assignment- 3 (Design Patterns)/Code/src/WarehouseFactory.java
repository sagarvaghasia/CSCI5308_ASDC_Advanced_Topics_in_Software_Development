
public class WarehouseFactory implements IWarehouseFactory
{
	@Override
	public IBattery createBattery(int capacity)
	{
		return new Battery(capacity);
	}

	@Override
	public IRobot createRobot(int batteryCapacity)
	{
		IBattery battery = createBattery(batteryCapacity);
		State startState = makeIdleState();
		return new Robot(battery, startState);
	}

	@Override
	public IRobot createRobotWithBatteryPack(int batteryCapacity, int packCapacity)
	{
		IBattery battery = createBattery(batteryCapacity);
		IBattery batterypack = createBattery(packCapacity);
		IBattery batterypackdecorator = new BatteryPack(battery, batterypack);

		IRobot robot = new Robot(batterypackdecorator, makeIdleState());
		return robot;
	}

	@Override
	public State makeIdleState()
	{
		return new IdleState();
	}

	@Override
	public State makeClaimItemState()
	{
		return new ClaimItemState();
	}

	@Override
	public State makeFinishedState()
	{
		return new FinishedState();
	}

	@Override
	public State makeLoadTruckState()
	{
		return new LoadTruckState();
	}

	@Override
	public State makeMoveToTruckState()
	{
		return new MoveToTruckState();
	}

	@Override
	public State makeMoveToShelfState()
	{
		return new MoveToShelfState();
	}

	@Override
	public State makeRechargeState(State nextState, IBattery battery)
	{
		return new RechargeState(nextState, battery);
	}

	@Override
	public State makeTakeItemState()
	{
		return new TakeItemState();
	}


}
