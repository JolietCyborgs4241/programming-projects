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
    int x4 = 0;
    int y4 = 0;
    int x5 = 0;
    int y5 = 0;
    Color cc = Color.WHITE;
    Color cc2 = Color.BLACK;
    
    LinkedList<String> sprite_names = new LinkedList<String>();
  
    void setup()
    {
    	createSprite(pencil, "Pencil.png");
    	setSpritePose(pencil, 0 , 0, 0);
    	setWindowBackgroundColor(Color.WHITE);
    	playAudioFile("enter.wav");	
    }
    void checkNumX()
    {
    	if((x - x1) > (x1 - x))
    	{
    		x4 = (x - x1);
    	}
    	else
    	{
    		x4 = (x1 - x);
    		x1 = x;
    	}
    }
    void checkNumY()
    {
    	if((y - y1) > (y1 - y))
    	{
    		y4 = (y - y1);
    	}
    	else
    	{
    		y4 = (y1 - y);
    		y1 = y;
    	}
    }
    void drawInstructions()
    {
    	if (Color.BLACK == cc )
    	{
    		drawText(Color.WHITE, 5, 10, "WASD = Move");
            drawText(Color.WHITE, 5, 20, "E = Set drawing starting point");
            drawText(Color.WHITE, 5, 30, "R = Clear");
            drawText(Color.WHITE, 5, 40, "T = Draw line");
            drawText(Color.WHITE, 5, 50, "Y = Draw rectangle");
            drawText(Color.WHITE, 5, 60, "U = Draw oval");
            drawText(Color.WHITE, 5, 70, "0-9 = Change BG color");
            drawText(Color.WHITE, 5, 80, "There is no undo button, so be careful!");
            drawText(Color.WHITE, 5, 90, "Numpad 0-9 = Change drawing color");

    	}
    	else
    	{
    		drawText(Color.BLACK, 5, 10, "WASD = Move");
            drawText(Color.BLACK, 5, 20, "E = Set drawing starting point");
            drawText(Color.BLACK, 5, 30, "R = Clear");
            drawText(Color.BLACK, 5, 40, "T = Draw line");
            drawText(Color.BLACK, 5, 50, "Y = Draw rectangle");
            drawText(Color.BLACK, 5, 60, "U = Draw oval");
            drawText(Color.BLACK, 5, 70, "0-9 = Change BG color");
            drawText(Color.BLACK, 5, 80, "There is no undo button, so be careful!");
            drawText(Color.BLACK, 5, 90, "Numpad 0-9 = Change drawing color");
    	}
    } 	
     /*
     *there are other commands, i just didn't want to include them as they are too complicated
     *X&C = draws a line that goes from the pencil to where E was pressed, use it for snapping & polygons.
     *Z = draws a white line over the most recently drawn line, can act as a pseudo-undo.
     *F&G set the pencil to where E was pressed on the X and Y axis, respectively. use for precision.
     *try and find the hidden command! :)
     */
    void setColor()
    {
    	if(getCurrentKeyPressed() == '`')
    	{
    		cc2 = Color.WHITE;
    	}
    	else if(getCurrentKeyPressed() == 'a')
    	{
    		cc2 = Color.RED;
    	}
    	else if(getCurrentKeyPressed() == 'b')
    	{
    		cc2 = Color.ORANGE;
    	}
    	else if(getCurrentKeyPressed() == 'c')
    	{
    		cc2 = Color.YELLOW;
    	}
    	else if(getCurrentKeyPressed() == 'd')
    	{
    		cc2 = Color.GREEN;
    	}
    	else if(getCurrentKeyPressed() == 'e')
    	{
    		cc2 = Color.BLUE;
    	}
    	else if(getCurrentKeyPressed() == 'f')
    	{
    		cc2 = Color.MAGENTA;
    	}
    	else if(getCurrentKeyPressed() == 'g')
    	{
    		cc2 = Color.PINK;
    	}
    	else if(getCurrentKeyPressed() == 'h')
    	{
    		cc2 = Color.GRAY;
    	}
    	else if(getCurrentKeyPressed() == 'i')
    	{
    		cc2 = Color.BLACK;
    	}
    }
    public void execute()
    {
        setup(); 
        drawInstructions();
        while(true)
        {   	              
        	setColor();
        	setSpritePose(pencil, x , y, 0);
        	if(getCurrentKeyPressed() == '0')
        	{
        		setWindowBackgroundColor(Color.WHITE);
        		cc = Color.WHITE;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '1')
        	{
        		setWindowBackgroundColor(Color.RED);
        		cc = Color.RED;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '2')
        	{
        		setWindowBackgroundColor(Color.ORANGE);
        		cc = Color.ORANGE;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '3')
        	{
        		setWindowBackgroundColor(Color.YELLOW);
        		cc = Color.YELLOW;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '4')
        	{
        		setWindowBackgroundColor(Color.GREEN);
        		cc = Color.GREEN;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '5')
        	{
        		setWindowBackgroundColor(Color.BLUE);
        		cc = Color.BLUE;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '6')
        	{
        		setWindowBackgroundColor(Color.MAGENTA);
        		cc = Color.MAGENTA;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '7')
        	{
        		setWindowBackgroundColor(Color.PINK);
        		cc = Color.PINK;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '8')
        	{
        		setWindowBackgroundColor(Color.GRAY);
        		cc = Color.GRAY;
        		drawInstructions();
        	}
        	else if(getCurrentKeyPressed() == '9')
        	{
        		setWindowBackgroundColor(Color.BLACK);
        		cc = Color.BLACK;
        		drawInstructions();
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
        		drawLine(cc2, x1, y1, x , y);
        		x2 = x1;
        		y2 = y1;
        		x1 = x;
        		y1 = y;
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'X')
        	{
        		drawLine(cc2, x, y, x3, y3);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'Y')
        	{
        		checkNumX();
        		checkNumY();
        		drawRectangle(cc2, x1, y1, x4 , y4 );
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'U')
        	{
        		checkNumX();
        		checkNumY();
        		drawOval(Color.BLACK, x1, y1, x4, y4);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	else if(getCurrentKeyPressed() == 'Z')
        	{
        		drawLine(cc, x, y, x2, y2);
        		playAudioFile("draw.wav");
        		sleep(500);
        	}
        	if(getCurrentKeyPressed() == 'R')
        	{
        		clearDrawings();
        		playAudioFile("LTuneDLGLoop.wav");
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
        	if(getCurrentKeyPressed() == 'N')
        	{
        		x5 = x3;
        		x = x5;
        	}
        	else if(getCurrentKeyPressed() == 'M')
        	{
        		y5 = y3;
        		y = y5;
        	}
        	sleep(refresh_millis);
        }
           
    }
}
