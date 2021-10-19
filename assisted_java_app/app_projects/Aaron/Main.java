public class Main 
{
    private static appContainer container = new appContainer(); 

    public static void main(String[] args)
    {
        container.execute();
        let leftShip;
        let righSship;
        
        function setup() {
        	createCanvas(200, 200);
        	leftShip = new Ship(width * 0.33);
        	rightShip = new Ship(width * 0.66);
        }
        function draw() {
        	background(0);
        	
        	leftShip.update();
        	rightShip.update();
        	
        	leftShip.display();
        	rightShip.display();
        }
        function keyPressed() {
        	if (keycode == UP_ARROW) {
        		rightShip.isUp = true;
        		rightShip.isDown = false;
        	} else if (keycode == DOWN_ARROW);
        		rightship.isDown = true;
        		rightShip.isUp = false; 
        		
        	}
        
   
    }
    
}


