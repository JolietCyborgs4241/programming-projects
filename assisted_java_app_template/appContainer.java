import lower_level.app;

/* 
    This is where your app should be created. ALl files relavent to your app go in the "higher_level" folder, 
    with any images going into the "sprites" folder. 

    When programming, there will always be a main() function; it's what is called(ran) by the operating system 
    so your computer knows where to start in terms of executing your code. However, this time you will be 
    treating the "execute()" function as the "main()" or "public static void main(String[] args)" function. 
    
    NOTE: You can do really anything in this file, but just don't change anything inside of the
    app_container() function!

    "BUILT_IN FUNCTIONS":
    
    - createSprite(String sprite_name, String file_name) -> creates a sprite given the file name from the sprites folder.
    - deleteSprite(String sprite_name) 
    - displaySprite(String sprite_name, int x, int y) -> displays a sprite a specified coordinates, but it may or may 
                                                           not be visible depending on the sprite's visibility status.
     
    - toggleSpriteVisibility(String sprite_name, boolean visible) -> visible = true shows a sprite, and visible = false
                                                                       hides the sprite.
     
    Both functions below are to get the input from your computer's keyboard, but what it returns is an integer and 
    not a character given that not every key has a character.  
     
    - getKeyPressed()
    - getKeyReleased()
*/
    

// All code should be written in here:
public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }

    public void execute()
    {
        // Write code here: 

    }

}