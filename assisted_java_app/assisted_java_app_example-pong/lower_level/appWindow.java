package lower_level;

import javax.swing.*;
import lower_level.fundamentals.constants;
import lower_level.fundamentals.sprite;
import java.awt.*;
import java.util.LinkedList; 

public class appWindow extends JPanel
{
    private LinkedList<sprite> sprites = new LinkedList<sprite>();

    @Override
    protected void paintComponent(Graphics graphics) 
    {
        graphics = getPreparedGraphics(graphics);
        displayGraphics(graphics);
    }

    private Graphics getPreparedGraphics(Graphics graphics)
    {        
        super.paintComponent(graphics);
        super.repaint();
        super.setBackground(constants.DEFAULT_BACKGROUND_COLOR);

        try
        {
            Thread.sleep(constants.DELAY_IN_MILLIS);
        }
        catch(InterruptedException e){}

        return graphics;
    }

    private void displayGraphics(Graphics graphics)
    {
        for(int i = 0; i < sprites.size(); i++)
        {
            sprite current_sprite = sprites.get(i);

            if(current_sprite.getVisibilityStatus() == true)
            {
                graphics.drawImage
                (
                    current_sprite.getSpriteBufferedImage(), 
                    current_sprite.getSpriteCoords().x,
                    current_sprite.getSpriteCoords().y,
                    null
                );
            }
        }
    }

    protected void createSpriteObject(String sprite_name, String file_name)
    {
        sprites.addLast(new sprite(sprite_name, file_name));
    }

    protected void deleteSpriteObject(String sprite_name)
    {
        for(int i = 0; i < sprites.size(); i ++)
        {
            if(sprites.get(i).getSpriteName() == sprite_name)
            {
                sprites.remove(i); 
            }
        }
    }

    protected void setSpriteObjPose(String sprite_name, int x, int y)
    { 
        for(int i = 0; i < sprites.size(); i++)
        {
            if(sprites.get(i).getSpriteName() == sprite_name)
            {
                sprites.get(i).setSpriteCoords(x, y);
               
            }
        }
    }

    protected void toggleSpriteObjectVisibility(String sprite_name, boolean visible)
    {
        for(int i = 0; i < sprites.size(); i++)
        {
            if(sprites.get(i).getSpriteName() == sprite_name)
            {
                sprites.get(i).setVisibilityStatus(visible);
            }
        }
    }
}
