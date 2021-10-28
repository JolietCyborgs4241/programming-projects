import lower_level.app;
import lower_level.fundamentals.constants;

/* 
    This is where your app should be created. All code relavent to your app goes in this file, and any
    images for sprites should be put into the "sprites" folder. 

    When programming, there will always be a main() function; it's what is called(ran) by the operating system 
    so your computer knows where to start in terms of executing your code. However, this time you will be 
    treating the "execute()" function as the "main()" or "public static void main(String[] args)" function. 
    
    NOTE: You can do really anything in this file, but just don't change anything inside of the
    appContainer() function!

    "BUILT_IN FUNCTIONS":
    
    - createSprite(String sprite_name, String file_name) -> creates a sprite given the file name from the sprites folder.
    - deleteSprite(String sprite_name) 
    - setSpritePose(String sprite_name, int x, int y) -> sets a sprite's coordinates, but it may or may 
                                                           not be visible depending on the sprite's visibility status.
     
    - toggleSpriteVisibility(String sprite_name, boolean visible) -> visible = true shows a sprite, and visible = false
                                                                       hides the sprite.
     
    Both functions below are to get the input from your computer's keyboard, but what it returns is an integer and 
    not a character given that not every key has a character.  
     
    - getCurrentKeyPressed()
    - getLastKeyReleased()
*/
    

// All code should be written in here:
public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }
    
    String paddle = new String();
    String ball = new String();
    
    int ballX = 0, ballY = 0;
    int paddleX = 0, paddleY = 300;
    
    boolean gameOver = false;
    
    void setup()
    {
    	createSprite(paddle, "block.png");
    	setSpritePose(paddle, paddleX, paddleY, 0);
 
    	createSprite(ball, "greenball.png");
    	setSpritePose(ball, ballX, ballY, 0);
    }
    
    void display()
    {
    	setSpritePose(paddle, paddleX, paddleY, 0);
    	setSpritePose(ball, ballX, ballY, 0);
    }
    
    void userInput()
    {
    	if(getCurrentKeyPressed() == 'J')
    	{
    		paddleX--;
    	}
    	else if(getCurrentKeyPressed() == 'K')
    	{
    		paddleX++;
    	}
    }


    public void execute()
    {  
    	setup();
        
    	while(!gameOver)
    	{
    		userInput();
    		display();
    		sleep(2);
    	}
    }   
 }

