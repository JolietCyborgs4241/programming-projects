import java.util.LinkedList;
import java.util.Random;

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

    String star = "star";
    String star_img = "star.png"; 
    int star_grid_id = 2;

    String circle = "circle"; 
    String circle_img = "circle.png";
    int circle_grid_id = 1;
    
    LinkedList<String> squares = new LinkedList<String>(); 
    String square_img = "square.png";
    int square_grid_id = 0; 

    int grid_row = 5;
    int grid_col = 5; 
    int[][] grid = 
    {
        {0, 0, 2, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
    };

    void printGrid()
    {
        int square_length = 100; 
        int horizontal_dis = 50;
        int vertical_dis = 50; 

        for(int current_row = 0; current_row < grid_row; current_row++)
        {
            for(int current_col = 0; current_col < grid_col; current_col++)
            {
                String sprite_name = "";

                if(grid[current_row][current_col] == circle_grid_id)
                {
                    sprite_name = circle;
                }
                else if(grid[current_row][current_col] == star_grid_id)
                {
                    sprite_name = star; 
                }
                else if(grid[current_row][current_col] == square_grid_id)
                {
                    sprite_name = new String();
                    createSprite(sprite_name, square_img);
                    squares.addLast(sprite_name);
                }   

                setSpritePose
                (
                    sprite_name, 
                    current_col * square_length + horizontal_dis, 
                    current_row * square_length + vertical_dis
                );         
            }
        }
    }

    void deleteSquares()
    {
        for(int i = 0; i < squares.size(); i++)
        {
            deleteSprite(squares.get(i));
            squares.clear(); 
        }
    }

    public void execute()
    {
        createSprite(star, star_img); 
        createSprite(circle, circle_img); 

        while(true)
        {
            printGrid();
            sleep(250);
            deleteSquares();
        }
    }
}
