import javax.swing.*;
import java.awt.*;
public class SignalApplet2 extends JFrame {
    public SignalApplet2()
    {
        setVisible(true);
        setSize(400,400);
        JPanel p1=new Movcar();
        getContentPane().add(p1);
    }
    public static void main(String args[])
    {
        new SignalApplet2();
    }
}
class Movcar extends JPanel implements Runnable{
    Thread t;
    int x=10,y=50;
    public Movcar()
    {
        setBackground(Color.BLUE);
        setForeground(Color.YELLOW);
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        while(true)
        {x=x+10;
        if(x>980)
        {
            x=10;
            y=50;
        }
        repaint();
        try
        {
            if(x>250&&x<319)
            {
                Thread.sleep(150);
            }
            else if(x==300)
            {
                Thread.sleep(150);
            }
            else if(x==320)
            {Thread.sleep(1000);
            }
            else
            {
                Thread.sleep(100);
            }
        }
        catch(Exception ex)
        {
        }
        }
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x,y,100,50);
      g.setColor(Color.yellow);
        g.fillRect(x+100,y+25,25,25);
       g.setColor(Color.black);
            g.fillOval(x+15, y+35, 25, 25);
            g.fillOval(x+45,y+35,25,25);
             g.fillOval(x+95,y+35,25,25);
        g.setColor(Color.blue);
        g.fillRect(0,110,1000,25) ;
        g.setColor(Color.white);
        g.fillRect(450,50,10,55);
        if(x>250&&x<319)
        {
            g.setColor(Color.red);
        }
        else if(x==320){
            g.setColor(Color.pink);
        }
        else
        {
            g.setColor(Color.green);
        }
        g.fillOval(450,55,12,12);}
}
        /*project to show the use of thread class*/
