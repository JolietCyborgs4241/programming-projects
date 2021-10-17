import lower_level.app;
import lower_level.fundamentals.constants;
import java.awt.*;
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

    // the x-coord that all sprites are set relative to:
    int camera_x = WINDOW_WIDTH; 

    String background_id = new String(); 
    String foreground_1_id = new String();
    String foreground_2_id = new String();
    String bird_id = new String();

    String foreground_file = "foreground2.png";
    String background_file = "background.png";
    String[] bird_files = {"bird_1.png", "bird_2.png"};

    // execeute() runs periodically every 10 milliseconds!
    // rates are in units per second
    final int DELAY_IN_MILLIS = 20;
    final int GND_LVL_Y = 547;
    int background_x = -26, background_y = 0;
    int bird_x = WINDOW_WIDTH / 5, bird_y = WINDOW_HEIGHT / 2; 
    double bird_y_velo = -300;  // pxls/sec
    double camera_x_velo = WINDOW_WIDTH; // pxls/sec
    double accel_y = 1800; // pxls/sec^2
    boolean game_over = false; 

    private int getScaledRateOfChange(double units_per_sec, int delay_in_millis)
    {
        return (int)(delay_in_millis * units_per_sec / 1000);
    }
    
    private void setup()
    {  
        createSprite(background_id, background_file);
        setSpritePose(background_id, background_x, background_y, 0);
        createSprite(foreground_1_id, foreground_file);
        createSprite(foreground_2_id, foreground_file);
        createSprite(bird_id, bird_files[0]);

        
    }

    private void display()
    {
        if(camera_x > 0)
        {
            camera_x -= getScaledRateOfChange(camera_x_velo, DELAY_IN_MILLIS);  
        }
        else
        {
            camera_x = WINDOW_WIDTH;
        }
        
        setSpritePose(bird_id, bird_x, bird_y, 0);
        setSpritePose(foreground_1_id, camera_x - WINDOW_WIDTH, 0, 0);
        setSpritePose(foreground_2_id, camera_x, 0, 0);
    }

    public void execute()
    {   
        setup();
        
        boolean once = true; 

        while(true)
        {   
            if(bird_y < GND_LVL_Y - getSpriteImageHeight(bird_id))
            {
                bird_y_velo += getScaledRateOfChange(accel_y, DELAY_IN_MILLIS);
            }
            else
            {
                bird_y = GND_LVL_Y - getSpriteImageHeight(bird_id);
                bird_y_velo = 0;
            }

            if(getCurrentKeyPressed() == ' ' && once)
            {
                bird_y_velo = -450;
                once = false;
                playAudioFile("gained_point.wav");
            }
            else if(getCurrentKeyPressed() == 0)
            {
                once = true; 
            }

            bird_y += getScaledRateOfChange(bird_y_velo, DELAY_IN_MILLIS);

            display();
            sleep(DELAY_IN_MILLIS);
        }
    }
}