# programming-projects
Not specifically robot-related software but intended for learning, demos, and other similar purposes.

Contents include:


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
