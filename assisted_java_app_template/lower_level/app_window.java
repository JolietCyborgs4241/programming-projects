package lower_level;

import javax.imageio.ImageIO;
import javax.swing.*;

import lower_level.fundamentals.constants;

import java.awt.*;
import java.awt.image.*;
import java.io.*; 

public class app_window extends JPanel
{
    public app_window()
    {

    }

    @Override
    protected void paintComponent(Graphics graphics) 
    {
        graphics = getPreparedGraphics(graphics);
        displayGraphics(graphics);
    }

    //private void display

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
        
    }

}
