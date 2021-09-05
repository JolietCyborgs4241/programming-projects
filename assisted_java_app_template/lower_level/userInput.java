package lower_level;

import java.awt.event.*;

public class userInput implements KeyListener
{
    private int key_pressed = 0;
    private int key_released = 0; 

    protected KeyListener getKeyListener()
    {
        return this; 
    }

    protected int getKeyPressed()
    {
        return key_pressed;
    }
    
    protected int getKeyReleased()
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
