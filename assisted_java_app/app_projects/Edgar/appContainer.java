import lower_level.app;

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
    
    void setup()
    {
    	createSprite("block", "block.png");
    	createSprite("greenball", "greenball.png");
    	setSpritePose("block", 575, 575, 0);
    	setSpritePose("greenball", 655, 535, 0);
    }

    public void execute()
    {  
        int blockX = 575;
        int blockY = 575;
        int ballX = 655;
        int ballY = 530;
        
        setup();
        
        while (true) 
        {           
        	if(getCurrentKeyPressed() == 'J'  && blockX > 0) 
        	{
        		blockX--;	
        	}
        	else if(getCurrentKeyPressed() == 'L' && blockX < 400) 
        	{
        		blockX++;	
        	}
        	sleep(1);
                       
            if(getCurrentKeyPressed() == 'I') 
            	{
            		while(ballY < 550) 
            		{
            			setSpritePose("greenball", 655, ballY, 0);
            			ballY--;
            			sleep(3);
            		}   	
            	}	
               
            setSpritePose("block", blockX, blockY, 0);
        }   	   
    }   
 }

