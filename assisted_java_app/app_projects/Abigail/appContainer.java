import lower_level.app;

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

    public void execute()
    {
    	int a = 1; 
    	int b = 2;
    	int c = 3;
    	
    	int arr[][] = new int [3][3];
    	arr[0][0] = a+a;
    	arr[0][1] = a+b;
    	arr[0][3] = a+c; 
    	
    	arr[1][0] = b+a;
    	arr[1][1] = b+b;
    	arr[1][2] = b+c;
    	
    	arr[2][0] = c+a;
    	arr[2][1] = c+b;
    	arr[2][2] = c+c;
    	
    	System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
    	System.out.println(arr[1][0] + " " + arr[1][1] + ' ' + arr[1][2]);
    	System.out.println(arr[2][0] + " " + arr[2][1] + " " + arr[2][2]);
    	        	}
        	
       
}

