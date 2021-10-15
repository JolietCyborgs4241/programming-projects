import java.util.LinkedList;
import java.util.Random;

import lower_level.app;
import lower_level.fundamentals.constants;

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

    final int WINDOW_WIDTH = constants.FRAME_BORDER_X;
    final int WINDOW_HEIGHT = constants.FRAME_BORDER_Y;
    final int DELTA_X = 1; 

    // the x-coord that all sprites are set relative to:
    int camera_x = WINDOW_WIDTH; 

    String background_id = new String(); 
    String foreground_1_id = new String();
    String foreground_2_id = new String();

    String foreground_file_name = "foreground2.png";
    String background_file_name = "background.png";
    
    private void setup()
    {  
        createSprite(background_id, background_file_name);
        setSpritePose(background_id, -26, 0, 0);
        
        createSprite(foreground_1_id, foreground_file_name);
        createSprite(foreground_2_id, foreground_file_name);
    }

    public void execute()
    {   
        setup();

        createSprite("bird", "bird_1.png"); int i = 0;

        while(true)
        {
            if(i < 125)
            {
                setSpriteImage("bird", "bird_1.png");
            }
            else if(i >= 125 && i < 250)
            {
                setSpriteImage("bird", "bird_2.png");
            }
            else
            {
                i = 0;
            }
            
            setSpritePose("bird", 250, 300, 0);
            setSpritePose(foreground_1_id, camera_x - WINDOW_WIDTH, 0, 0);
            setSpritePose(foreground_2_id, camera_x, 0, 0);

            if(camera_x > 0)
            {
                camera_x = camera_x - DELTA_X;  
            }
            else
            {
                camera_x = WINDOW_WIDTH;
            }

            i++;
            sleep(8);
        }
    }
}
