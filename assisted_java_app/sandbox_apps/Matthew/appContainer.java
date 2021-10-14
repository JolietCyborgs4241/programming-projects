import java.util.LinkedList;
import java.util.Random;

import lower_level.app;

/*  
    - createSprite(String sprite_name, String file_name) -> creates a sprite given the file name from the sprites folder.
    - deleteSprite(String sprite_name) 
    - setSpritePose(String sprite_name, int x, int y) -> sets a sprite's coordinates, but it may or may 
                                                           not be visible depending on the sprite's visibility status.
   
    - toggleSpriteVisibility(String sprite_name, boolean visible) -> visible = true shows a sprite, and visible = false
                                                                       hides the sprite. 
    - getCurrentKeyPressed()
    - getLastKeyReleased()
*/

public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }
    
    public void execute()
    {
    	int deg = 0;
        createSprite("obj", "paddle.png");
        while(true)
        {
        	setSpritePose("obj", 100, 100, deg);
        	deg++;
        	sleep(3);
        }
    }
}
