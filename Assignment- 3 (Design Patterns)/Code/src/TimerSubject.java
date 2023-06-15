import javax.swing.Timer;
import java.awt.event.*;

public class TimerSubject extends Subject
{
    /*
        This subject notifies it's observers once every second.
    */
    private TimerSubject()
    {
        super();
    }

    private static TimerSubject timerSubject;

    public static TimerSubject instance()
    {
        if(timerSubject == null)
        {
            timerSubject = new TimerSubject();
        }
        return timerSubject;
    }
}
