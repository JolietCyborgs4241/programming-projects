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
    	drawText(Color.CYAN, 5, 10, "WASD = Move");
        drawText(Color.CYAN, 5, 20, "E = Set drawing starting point");
        drawText(Color.CYAN, 5, 30, "R = Clear");
        drawText(Color.CYAN, 5, 40, "T&I = Draw line");
        drawText(Color.CYAN, 5, 50, "Y&O = Draw rectangle");
        drawText(Color.CYAN, 5, 60, "U&P = Draw oval");
        drawText(Color.CYAN, 5, 70, "0-9 = Change BG color");
        drawText(Color.CYAN, 5, 80, "There is no undo button, so be careful!");
     /*
     *there are other commands, i just didn't want to include them as they are too complicated
     *X&C = draws a line that goes from the pencil to where E was pressed, use it for snapping & polygons
     *Z = draws a white line over the most recently drawn line, can act as a pseudo-undo
     *try and find the hidden command! :)
     */
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
        	else if(getCurrentKeyPressed() == '6')
        	{
        		setWindowBackgroundColor(Color.MAGENTA);
        	}
        	else if(getCurrentKeyPressed() == '7')
        	{
        		setWindowBackgroundColor(Color.PINK);
        	}
        	else if(getCurrentKeyPressed() == '8')
        	{
        		setWindowBackgroundColor(Color.GRAY);
        	}
        	else if(getCurrentKeyPressed() == '9')
        	{
        		setWindowBackgroundColor(Color.BLACK);
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
        		x3 = x;
        		y3 = y;
        		playAudioFile("k.wav");
        		sleep(200);
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
        	if(getCurrentKeyPressed() == ',')
        	{
        		setSpriteImage(pencil, "Mario.png");
        	}
        	else if(getCurrentKeyPressed() == '.')
        	{
        		setSpriteImage(pencil, "pencil.png");
        	}
        	sleep(refresh_millis);
        }
           
    }
}
