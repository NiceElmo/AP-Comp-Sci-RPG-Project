
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**
 * Class thingy - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class thingy extends Applet implements ActionListener, KeyListener
{
    Image img;
    AudioClip soundss;
    Button play, loop, stop;
    int x = 200, y = 200;
    int number = 0;
    public void init(){
        this.requestFocus();
        addKeyListener(this);
        setSize(400,400);
        img = getImage(getCodeBase(), "alien1.jpg");
        soundss = getAudioClip(getDocumentBase(), "roar.wav");
        play = new Button ("Play");
        loop = new Button ("Loop");
        stop = new Button ("Stop");
        play.addActionListener(this);
        loop.addActionListener(this);
        stop.addActionListener(this);
        add(play);
        add(loop);
        add(stop);

    }
    public void paint(Graphics g){
        
        g.drawImage(img, x, y, this);
        g.drawRect(x,y,20,20);
        g.drawString("thing" + number,20,20);
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == play){
            soundss.play();
        }
        if(e.getSource() == loop){
           soundss.loop();
        }
        if(e.getSource() == stop){
            soundss.stop();
        }
    
    }
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_UP){
            y = y-10;
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y = y+10;
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x = x-10;
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x = x+10;
            this.repaint();
        }
        this.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e){
    
    }
    @Override
    public void keyTyped(KeyEvent e){
    
    }

}
