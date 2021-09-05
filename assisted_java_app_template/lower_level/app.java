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

    public int getKeyPressed()
    {
        return input.getKeyPressed();
    }

    public int getKeyReleased()
    {
        return input.getKeyReleased(); 
    }
   
}
