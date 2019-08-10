#include "Servo.h"

#define TURN_PORT 6  //Shows which Arduino port each servo is attached to
#define HEIGHT_PORT 9
#define REACH_PORT 10
#define CLAW_PORT 11

Servo turn;  //Declares the 4 servos on the arm
Servo height;
Servo reach;
Servo claw;

int Turn;  //Sets variables to use the values taken from the 4 pot sensors
int Height;
int Reach;
int Claw;

void setup() {
  turn.attach(TURN_PORT); //Tells the Arduino where every servo is
  height.attach(HEIGHT_PORT);
  reach.attach(REACH_PORT);
  claw.attach(CLAW_PORT);

  Serial.begin(115200);
}

void loop() {
  Turn = analogRead(A3);  //Port each of the pot sensors is connected to
  Turn = map(Turn, 0, 1023, 0, 180);
  turn.write(Turn);  //Gives the servo the value of the pot sensor
  
  Height = analogRead(A2);
  Height = map(Height, 0, 1023, 0, 180);
  height.write(Height);
  
  Reach = analogRead(A1);
  Reach = map(Reach, 0, 1023, 0, 180);
  reach.write(Reach);
  
  Claw = analogRead(A0);
  Claw = map(Claw, 0, 1023, 0, 160);  //Restriction so claw servo does not overheat if it can't make it all the way
  claw.write(Claw);
}
