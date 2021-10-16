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

    public void execute()
    {
    	createSprite("ball", "ball.png");
        setSpritePose("ball", 350, 300, 0);
        createSprite("paddle_1", "paddle.png"); 
        setSpritePose("paddle_1", 100, 200, 0);    
        createSprite("paddle_2", "paddle.png");
        setSpritePose("paddle_2", 600, 200, 0 );
        
        int paddle1x = 0;
        int paddle1y = 100;
        int paddle2x = 750;
        int paddle2y = 100;
        int x = 0;
      
        	while (true) 
        	{ 
        		
        		setSpritePose("paddle_1", paddle1x, paddle1y, 0);
        			
        		if(getCurrentKeyPressed() == 'A') 
        		{
        			paddle1y++;
        		}
        		else if(getCurrentKeyPressed() == 'D') 
        		{
        			paddle1y--;
        		}	
        	
        		setSpritePose("paddle_2", paddle2x, paddle2y, 0);
        		
        		if(getCurrentKeyPressed() == 'J') 
        		{
        			paddle2y++;
        		}
        		else if(getCurrentKeyPressed() == 'L') 
        		{
        			paddle2y--;
        		}
        		sleep(2);
        	    
        		
        	   
        	}
        	
       
    }
}
