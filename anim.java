
import java.awt.*;
import java.applet.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Class anim - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class anim extends Applet
{
    Timer timer;
    int ballx = 10;
    int bally = 10;
    int ballxvel = 10;
    int ballyvel = 10;
    public void init(){
        timer = new Timer();
        timer.schedule(new TimerTask(),100,100);
    }
            @Override
            public void run()
            {
                ballx+=ballxvel;
                bally+=ballyvel;
                repaint();
                
            }
        
    
    

    public void paint(Graphics g){
        g.fillOval(ballx, bally, 20, 20);
    
    }
 
}
