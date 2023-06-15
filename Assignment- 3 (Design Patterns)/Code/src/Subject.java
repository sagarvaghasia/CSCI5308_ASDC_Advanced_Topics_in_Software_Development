import java.util.*;

public abstract class Subject
{
    private final List<ITimerObserver> observers;

    public Subject()
    {
        observers = new ArrayList<ITimerObserver>();
    }

    // Subscribe an observer to the subject. The observer will be
    // notified when the subject is notified.
    public void attach(ITimerObserver observer)
    {
        observers.add(observer);
    }

    // Cancel an observer's subscription to the subject. The observer
    // is no longer interested in being notified.
    public void detach(ITimerObserver observer)
    {
        observers.remove(observer);
    }

    // Notify all observers of the subject that the subject
    // event has happened. I wanted this to be called notify() but
    // Java has the Object.notify() method as final.
    public void notifyObservers()
    {
        ListIterator<ITimerObserver> iter = observers.listIterator();
        while (iter.hasNext())
        {
            iter.next().timeElapsed(1);
        }
    }
}
