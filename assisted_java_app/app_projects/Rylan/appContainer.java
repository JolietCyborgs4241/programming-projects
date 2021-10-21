import lower_level.app;
import java.awt.*;
import java.util.LinkedList;

public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }
 String pencil = "pencil"; 
    
    int refresh_millis = 5; 
    int y = 0;
    int x = 0;
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    int x3 = 0;
    int y3 = 0;
    
    LinkedList<String> sprite_names = new LinkedList<String>();
  
    void setup()
    {
    	createSprite(pencil, "Pencil.png");
    	setSpritePose(pencil, 0 , 0, 0);
    	setWindowBackgroundColor(Color.WHITE);
    	playAudioFile("enter.wav");	
    }
    void drawInstructions()
    {
    	drawText(Color.BLACK, 5, 10, "WASD = Move");
        drawText(Color.BLACK, 5, 20, "E = Set drawing starting point");
        drawText(Color.BLACK, 5, 30, "R = Clear");
        drawText(Color.BLACK, 5, 40, "T&I = Draw line");
        drawText(Color.BLACK, 5, 50, "Y&O = Draw rectangle");
        drawText(Color.BLACK, 5, 60, "U&P = Draw oval");
        drawText(Color.BLACK, 5, 70, "0-5 = Change BG color");
        drawText(Color.BLACK, 5, 80, "There is no undo button, so be careful!");
    }
    
    public void execute()
    {
        setup(); 
        drawInstructions();
        while(true)
        {   	              
        	System.out.println((char)getCurrentKeyPressed());
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
        	else if(getCurrentKeyPressed() == 'Q')
        	{
        		x3 = x;
        		y3 = y;
        	}
        	else if(getCurrentKeyPressed() == 'T')
        	{
        		drawLine(Color.BLACK, x1, y1, x , y);
        		x2 = x1;
        		y2 = y1;
        		x1 = x;
        		y1 = y;
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'X')
        	{
        		drawLine(Color.BLACK, x, y, x3, y3);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'C')
        	{
        		drawLine(Color.WHITE, x, y, x3, y3);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'I')
        	{
        		drawLine(Color.WHITE, x1, y1, x , y);
        		x1 = x;
        		y1 = y;
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'Y')
        	{
        		drawRectangle(Color.BLACK, x1, y1, x - x1, y - y1);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'O')
        	{
        		drawRectangle(Color.WHITE, x1, y1, x - x1, y - y1);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'U')
        	{
        		drawOval(Color.BLACK, x1, y1, x - x1, y - y1);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'P')
        	{
        		drawOval(Color.WHITE, x1, y1, x - x1, y - y1);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'Z')
        	{
        		drawLine(Color.WHITE, x, y, x2, y2);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	if(getCurrentKeyPressed() == 'R')
        	{
        		clearDrawings();
        		playAudioFile("draw.wav");
        		drawInstructions();
        		sleep(500);
        	}
        	sleep(refresh_millis);
        }
           
    }
}
