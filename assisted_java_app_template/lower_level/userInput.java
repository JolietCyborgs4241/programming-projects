package lower_level;

import java.awt.event.*;

public class userInput implements KeyListener
{
    private int key_pressed = 0;
    private int key_released = 0; 

    public KeyListener getKeyListener()
    {
        return this; 
    }

    public int getKeyPressed()
    {
        return key_pressed;
    }
    
    public int getKeyReleased()
    {
        return key_released;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        key_pressed = (char)e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        key_released = (char)e.getKeyCode();
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {}
}
