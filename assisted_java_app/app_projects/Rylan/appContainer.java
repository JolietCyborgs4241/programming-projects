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
    

    void linedraw()
    {
    	drawLine(Color.WHITE, x1, y1, x , y);
		sleep(100);
    }
    void setup()
    {
    	createSprite(pencil, "Pencil.png");
    	setSpritePose(pencil, 0 , 0, 0);
    	
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
        		drawLine(Color.WHITE, x1, y1, x , y);
        		x1 = x;
        		y1 = y;
        		sleep(100);
        	}
        	sleep(refresh_millis);
        	
        }
           
    }
}
