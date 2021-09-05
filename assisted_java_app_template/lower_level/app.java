package lower_level;

import javax.swing.*;
import lower_level.fundamentals.constants;

public class app extends JFrame
{
    private app_window window = new app_window(); 

    public app()
    {
        System.out.println("HW");
        super.setSize(constants.FRAME_BORDER_X, constants.FRAME_BORDER_Y);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(window);
        super.setVisible(true);
        super.addKeyListener(null);
    }

   
}
