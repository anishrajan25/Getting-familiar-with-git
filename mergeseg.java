import java.awt.*;  
import java.awt.event.*;  
import java.util.*;
import java.util.concurrent.*; 
public class mergeseg extends Frame implements MouseListener{  
	int check=1;
   // Button b;
	Scanner c=new Scanner(System.in);
	String s=c.next();
  	public mergeseg()
  	{
  		addMouseListener(this);
  		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
  	}
  	public void mouseClicked(MouseEvent e)
  	{
  		System.out.println("Mouse action");
  		start();
  		// if(check==0)
  			
  		// 	{check=1;start();}
  		// else
  		// 	check=0;
  	}
  	public void mouseEntered(MouseEvent e) {  
        // l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        // l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        // l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        // l.setText("Mouse Released");  
    }  
  	public void start(){
  		Toolkit t=Toolkit.getDefaultToolkit();
  		Dimension d=t.getScreenSize();
  		int width=d.width;
  		int height=d.height;
  		int randomx=(int)(Math.random()*(width-5+1)+5);
  		int randomy=(int)(Math.random()*(height-5+1)+5);
  		Graphics g1=getGraphics();
  		Color color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
  		g1.setColor(color);
  		int length=10;
  		int heght=10;
  		TimeUnit time = TimeUnit.MICROSECONDS; 
  		
  		while((randomy+heght)<height && (randomy-heght)>0 && (randomx+length)<width && (randomx-length)>0)
  		{
  			//System.out.println("entered");
  			if(check==0)
  				break;
  			g1.drawString(s,randomx,randomy);
  			//g1.drawPolygon(randomx,randomy,length,heght);
  			//g1.drawRect(randomx,randomy,length-length/2,heght-heght/2);
  			
  			//System.out.println("System printing");
  			length+=10;
  			heght+=10;
  		try{
  		time.sleep(8450);
  	}
  	catch(Exception e)
  	{

  	}
  }
  
  if(check==1)
  start();
  	}
    public static void main(String[] args) {  
        new mergeseg();  
    }  
}