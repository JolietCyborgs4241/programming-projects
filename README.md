# programming-projects
Not specifically robot-related software but intended for learning, demos, and other similar purposes.

Contents include:

## dow_clock_test

Test software for the Day of the Week clock.  This includes support for the "setting" button, a single LED, and servo output.  The test program uses the setting button to toggle the LED on / off and the servo starts at one end and slowly sweeps through 180 degrees and then positions the pointer at 90 degrees (typically right in the middle of the "WED" day).


## Robot Arms

These are projects that give some manipulation experience as well as create things we could show at Open Houses (including
letting people work them).

### EEZYbotARM (MK1)
Code for the servo-based eezybot arm - http://www.eezyrobots.it/eba_mk1.html (also at https://www.thingiverse.com/thing:1015238).  Known as the MK1 arm once the later versions were released.

Uses 4 pots to directly control each servo - turn, reach, height, and claw.

### EEZYbotARM-MK2
Improved arm - http://www.eezyrobots.it/eba_mk2.html (also at https://www.thingiverse.com/thing:1454048).  Larger and more powerful than MK1 arm.

Uses 4 pots to control but in a differential mode - center the pot and the corresponding motion on the arm stops - moving off center causes the arm to move in a specific direction proportional to how far the know is turned up to the top speed.  Includes a set of Red/Yellow/Green LEDs for each indicate what direction the arm is moving (yellow if it isn't moving at that joint).

### WE-R2.4 Six-Axis Robot Arm

A much more complicated 6-axis arm using stepper motors at each joint.  Available at https://www.thingiverse.com/thing:3327968 using the actuators at https://www.thingiverse.com/thing:3293562 and the gripper at 
https://www.thingiverse.com/thing:3116728.

Still being fabricated - planned to be controlled by two 4 position joysticks (turn, reach, height, and claw) using all 6 joints to in a coordinated manner to support making the arm move in only one directions at a time (when you reach forward or back, the robot will coordinate with the among the movable joints to maintain the same height for example).

## Assisted Java App Template

A template for creating applications in Java with increased abstraction. This template allows programmers to easily create applications with code that consists of anything ranging from variables, to logic statements and operators, to loops, and to functions; without any further kind of object-oriented programming needed. The goal of this template is to enable and encourage programmers to continuously exercise their understanding of Java before moving onto more advanced concepts. 

The template has programmers write their code in the appContainer.java file, where appContainer.java extends app.java so everything needed for a Java application is inherited via superclass methods that can simply be treated as "built-in" functions. 
