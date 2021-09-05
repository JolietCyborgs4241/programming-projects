import lower_level.app;

/* 
    This is where your app should be created. ALl files relavent to your app go in the "higher_level" folder, 
    with any images going into the "sprites" folder. 

    When programming, there will always be a main() function; it's what is called(ran) by the operating system 
    so your computer knows where to start in terms of executing your code. However, this time you will be 
    treating the "execute()" function as the "main()" or "public static void main(String[] args)" function. 
    
    NOTE: You can do really anything in this file, but just don't change anything inside of the
    app_container() function!
*/

// All code should be written in here:
public class app_container extends app 
{ 
    public app_container()
    {
        super();
    }

    public void execute()
    {
        // Write code here: 

        System.out.println("Hellow World!");
    }

}