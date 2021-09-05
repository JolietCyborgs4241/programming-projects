package lower_level;

import javax.swing.*;
import lower_level.fundamentals.constants;

public class app extends JFrame
{
    private appWindow window = new appWindow(); 
    private userInput input = new userInput();

    public app()
    {
        super.setSize(constants.FRAME_BORDER_X, constants.FRAME_BORDER_Y);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(window);
        super.setVisible(true);
        super.addKeyListener(input.getKeyListener());
    }

    public void createSprite(String sprite_name, String file_name)
    {
        window.createSpriteObject(sprite_name, file_name);
    }

    public void deleteSprite(String sprite_name)
    {
        window.deleteSpriteObject(sprite_name);
    }

    public void toggleSpriteVisibility(String sprite_name, boolean visible)
    {
        window.toggleSpriteObjectVisibility(sprite_name, visible);
    }

    public void displaySprite(String sprite_name, int x, int y)
    {
        window.displaySpriteObj(sprite_name, x, y);
    }

    public int getKeyPressed()
    {
        return input.getKeyPressed();
    }

    public int getKeyReleased()
    {
        return input.getKeyReleased(); 
    }
   
}
