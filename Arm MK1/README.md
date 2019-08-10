# MK1 Arm Code

This is the smallest mechanical arm that has been printed. The 4 pot sensors sit in a simple stand that keeps them all in place and together, allowing simple use of the arm.

Each of the servos is individually defined in the code. They all take the value dirctly from their associated pot sensor and move to that position. The map function can be used to restrict the movement of the servo if they cannot physically reach the position that is given to them from the pot sensor. That could happen because of the physical limitations created by the desgin of the arm itself. 
