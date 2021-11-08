import lower_level.app;
import java.awt. *;
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
    string player = "player";
    int playx = 0;
    int playy = 0;
    int y = 70;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;
    int x5 = 0;
    int score = 0;
    
    void setup()
    {
    	createSprite(player, 100, 250, 0);
    	createSprite("debris1", 0, y, 0);
    	createSprite("debris2", 0, y, 0);
    	createSprite("debris3", 0, y, 0);
    	createSprite("debris4", 0, y, 0);
    	createSprite("debris5", 0, y, 0);
    	drawRectangle(Color.WHITE, 0, 0, 100, 500);
    }
    
    public void execute()
    {
        setup();
        
    }
}
