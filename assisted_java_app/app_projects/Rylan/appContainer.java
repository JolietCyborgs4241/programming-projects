import lower_level.app;
import java.util.LinkedList;

/* 
    This is where your app should be created. All code relavent to your app goes in this file, and any
    images for sprites should be put into the "sprites" folder. 

    When programming, there will always be a main() function; it's what is called(ran) by the operating system 
    so your computer knows where to start in terms of executing your code. However, this time you will be 
    treating the "execute()" function as the "main()" or "public static void main(String[] args)" function. 
    
    NOTE: You can do really anything in this file, but just don't change anything inside of the
    appContainer() function!

    "BUILT_IN FUNCTIONS":
    
    - createSprite(String sprite_name, String file_name) -> creates a sprite given the file name from the sprites folder.
    - deleteSprite(String sprite_name) 
    - setSpritePose(String sprite_name, int x, int y) -> sets a sprite's coordinates, but it may or may 
                                                           not be visible depending on the sprite's visibility status.
     
    - toggleSpriteVisibility(String sprite_name, boolean visible) -> visible = true shows a sprite, and visible = false
                                                                       hides the sprite.
     
    Both functions below are to get the input from your computer's keyboard, but what it returns is an integer and 
    not a character given that not every key has a character.  
     
    - getCurrentKeyPressed()
    - getLastKeyReleased()
*/
    

// All code should be written in here:
public class appContainer extends app 
{ 
    public appContainer()
    {
        super();
    }
 String pencil = "ball"; 
    
    int refresh_millis = 5; 
    int y = 0;
    int x = 0;
    int z = 0;
    
    LinkedList<String> sprite_names = new LinkedList<String>();
    
    
    void setup()
    {
    	createSprite(pencil, "Pencil.png");
    	setSpritePose(pencil, 0 , 0, 0);
    }
    
    void clearSprites()
    {
    	for(int i = 0; i < sprite_names.size(); i++) 
    	{
    		deleteSprite(sprite_names.get(i));
    	}
    	
    	sprite_names.clear();
    }
    
    void generateSprites(String file_name, int no_sprites)
    {
    	for(int i = 0; i < no_sprites; i++)
    	{
    		String sprite_name = new String(); 
    		createSprite(sprite_name, file_name);
    		setSpritePose(sprite_name, 100 * i, 200, 0);
    		sprite_names.addLast(sprite_name);
    	}
    	
    	
    }

    public void execute()
    {
        
        setup(); // setting up program
        
        while(true)
        {
        	// loops as long as program is running
        	
        	System.out.println((char)getCurrentKeyPressed());
        	
        	setSpritePose(pencil, x , y, 0);
        	
        	if(getCurrentKeyPressed() == 'S')
        	{
        		y++;
        	}
        	else if(getCurrentKeyPressed() == 'D')
        	{
        		x++;
        	}
        	else if(getCurrentKeyPressed() == 'W')
        	{
        		y--;
        	}
        	else if(getCurrentKeyPressed() == 'A')
        	{
        		x--;
        	}
        	
        	if(getCurrentKeyPressed() == 'K')
        	{
        		
        	}
        	sleep(refresh_millis);
        }
           
    }
}
