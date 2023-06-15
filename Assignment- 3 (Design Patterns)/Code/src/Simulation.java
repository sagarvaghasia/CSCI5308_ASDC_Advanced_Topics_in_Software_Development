import java.util.*;

public class Simulation
{
	private static Simulation theOneInstance = null;
	private IWarehouseFactory factory;
	private List<Object> robots;
	private int minutesToCompleteSimulation;
	private Shelf shelf;
	
	public Simulation()
	{
		robots = new ArrayList<Object>();
		minutesToCompleteSimulation = 0;
		shelf = new Shelf();
	}
	
	public static Simulation instance()
	{
		if (null == theOneInstance)
		{
			theOneInstance = new Simulation();
		}
		return theOneInstance;
	}
	
	public IWarehouseFactory getFactory()
	{
		return factory;
	}
	
	public Shelf getShelf()
	{
		return shelf;
	}

	public void build(Arguments args, IWarehouseFactory factory)
	{
		this.factory = factory;
		shelf.setItemCount(args.getShelfCount());
		
		int totalRobots = args.getNumRobots();
		int robotsWithoutBatteryPack = totalRobots - args.getNumBatteryPacks();
		int robotsWithBatteryPack = args.getNumBatteryPacks();

		for(int i=0; i<robotsWithoutBatteryPack; i++)
		{
			IRobot robot = factory.createRobot(args.getDefaultBatteryCapacity());
			TimerSubject.instance().attach((ITimerObserver) robot);
			this.robots.add(robot);
		}

		for(int i=0; i<robotsWithBatteryPack; i++)
		{
			IRobot robot = factory.createRobotWithBatteryPack(args.getDefaultBatteryCapacity(), args.getBatteryPackCapacity());
			TimerSubject.instance().attach((ITimerObserver) robot);
			this.robots.add(robot);
		}
	}
	
	public int run()
	{
		System.out.println("Simulation begun!");
		boolean robotsStillWorking = true;
		while (robotsStillWorking)
		{
			TimerSubject.instance().notifyObservers();
			
			minutesToCompleteSimulation += 1;
			// Check all robots to see whether they are finished.
			robotsStillWorking = false;
			ListIterator<Object> iter = robots.listIterator();
			while (iter.hasNext())
			{
				IRobot robot = (IRobot)iter.next();
				if (robot.isWorking())
				{
					robotsStillWorking = true;
					break;
				}
			}
		}
		System.out.println("Simulation complete!");
		return minutesToCompleteSimulation;
	}
}

















