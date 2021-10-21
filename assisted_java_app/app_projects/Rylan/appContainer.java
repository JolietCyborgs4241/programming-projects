import lower_level.app;
import java.awt.*;
import java.util.LinkedList;

public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }
 String pencil = "ball"; 
    
    int refresh_millis = 5; 
    int y = 0;
    int x = 0;
    int x1 = 0;
    int y1 = 0;
    
    LinkedList<String> sprite_names = new LinkedList<String>();
  
    void setup()
    {
    	createSprite(pencil, "Pencil.png");
    	setSpritePose(pencil, 0 , 0, 0);
    	setWindowBackgroundColor(Color.WHITE);
    	playAudioFile("enter.wav");
    	   	
    }
    
    void linedraw()
    {
    	drawLine(Color.BLACK, x1, y1, x , y);

    }
   
    public void execute()
    {
    
        
        setup(); 
       
        while(true)
        {   	              	
        	setSpritePose(pencil, x , y, 0);
        	if(getCurrentKeyPressed() == '0')
        	{
        		setWindowBackgroundColor(Color.WHITE);
        	}
        	else if(getCurrentKeyPressed() == '1')
        	{
        		setWindowBackgroundColor(Color.RED);
        	}
        	else if(getCurrentKeyPressed() == '2')
        	{
        		setWindowBackgroundColor(Color.ORANGE);
        	}
        	else if(getCurrentKeyPressed() == '3')
        	{
        		setWindowBackgroundColor(Color.YELLOW);
        	}
        	else if(getCurrentKeyPressed() == '4')
        	{
        		setWindowBackgroundColor(Color.GREEN);
        	}
        	else if(getCurrentKeyPressed() == '5')
        	{
        		setWindowBackgroundColor(Color.BLUE);
        	}
        	if(getCurrentKeyPressed() == 'S')
        	{
        		y++;
        	}
        	else if(getCurrentKeyPressed() == 'D')
        	{
        		x++;
        	}
        	else if(getCurrentKeyPressed() == 'W')
        	{
        		y--;
        	}
        	else if(getCurrentKeyPressed() == 'A')
        	{
        		x--;
        	}
        	
        	if(getCurrentKeyPressed() == 'E')
        	{
        		x1 = x; 
        		y1 = y;
        		playAudioFile("k.wav");
        		sleep(200);
        	}
        	else if(getCurrentKeyPressed() == 'T')
        	{
        		drawLine(Color.BLACK, x1, y1, x , y);
        		x1 = x;
        		y1 = y;
        		playAudioFile("draw.wav");
        		sleep(500);
        	} 
        	else if(getCurrentKeyPressed() == 'Y')
        	{
        		drawRectangle(Color.BLACK, x1, y1, x - x1, y - y1);
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'U')
        	{
        		drawOval(Color.BLACK, x1, y1, x - x1, y - y1);
        		sleep(500);
        	}
        	if(getCurrentKeyPressed() == 'R')
        	{
        		clearDrawings();
        	}
        	sleep(refresh_millis);
        }
           
    }
}
