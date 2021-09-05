package lower_level.fundamentals;

import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.*;

public class sprite 
{
    private final String SPRITE_DIR;
    private final String SPRITE_BASE_DIR = "sprites/";
    private final String SPRITE_NAME; 
    private coordinates sprite_coords = new coordinates(0, 0); 
    private BufferedImage sprite_b_image = null;
    private boolean visible = true; 

    public sprite(String sprite_name, String file_name)
    {
        SPRITE_DIR = SPRITE_BASE_DIR + file_name; 
        SPRITE_NAME = sprite_name;
        sprite_b_image = getSpriteImage(SPRITE_BASE_DIR + file_name);  
    }

    private BufferedImage getSpriteImage(String sprite_dir)
    {   
        try
        {
            return ImageIO.read(new File(sprite_dir));
        }
        catch(IOException e) 
        {
            System.err.println("sprite.java: Caught exeception! Could not find a sprite's image! \n");
            return null;
        }
    }

    public void setSpriteCoords(int x, int y)
    {
        this.sprite_coords.x = x;
        this.sprite_coords.y = y; 
    }

    public void setVisibilityStatus(boolean visible)
    {
        this.visible = visible; 
    }
    public boolean getVisibilityStatus()
    {
        return visible; 
    }

    public String getSpriteDir()
    {
        return SPRITE_DIR; 
    }

    public String getSpriteName()
    {
        return SPRITE_NAME; 
    }

    public BufferedImage getSpriteBufferedImage()
    {
        return sprite_b_image; 
    }

    public coordinates getSpriteCoords()
    {
        return sprite_coords; 
    }
}
