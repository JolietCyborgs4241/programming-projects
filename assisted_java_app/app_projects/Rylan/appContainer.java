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
    	   	
    }
    
    void linedraw()
    {
    	drawLine(Color.BLACK, x1, y1, x , y);
		sleep(100);
    }
   
    public void execute()
    {
    
        
        setup(); 
       
        while(true)
        {      	        	
        	        	
        	
        	System.out.println(x);
        	System.out.println(y);
        	System.out.println(x1);
        	System.out.println(y1);
        	
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
        	
        	if(getCurrentKeyPressed() == 'K')
        	{
        		x1 = x; 
        		y1 = y;
        	}
        	else if(getCurrentKeyPressed() == 'L')
        	{
        		drawLine(Color.BLACK, x1, y1, x , y);
        		x1 = x;
        		y1 = y;
        		sleep(100);
        	}
        	sleep(refresh_millis);
        	
        }
           
    }
}
