// dow_clock_test
//
// test the dow clock hardware
//
// tests the servo:  moves from 0 - 180 degrees at a rate of 20 degrees per second - when it reaches 180,
//                   it waits for one second and then moves to 90 for easy pointer alignment
//
// tests the pushbutton:  pushing the bu5tton generates an interrups and drives the extra LED on so long
//                        as the button is pressed


#include <Servo.h>

#define SERVO_PIN           9       // needs to be on a PWM-capable pin
#define LED_PIN             13       // can be mostly any pin but we'll use the standard on-board LED
#define BUTTON_PIN          3       // external interrupts have to be on 2 or 3 on the Nano because of the ATmega328 limitations
                                    // different on differnt processors (some can use any digital pin)
                                    
#define DEBOUNCE_MILLISECS  100     // ignore switch pushes within this number of milliseconds f each other


Servo DowServo;

volatile int   LedState = 0;

unsigned long  LastISRTime = 0;     // time the Interru[t service routine (ISR for short) for called previously


void ButtonISR() {

  // this is an ISR - Interrupt Service Routine
  //
  // it gets called whenever the input line it is associated with has some happen (the "something" is configurable)
  //
  // "interrupts" interrupt other code that's running - this function gets called when the conditions happen
  //
  // because of this, the other code that was running us suspended - don't do too much in an interrupt
  // service routine - just do something short or set a flag to handle something later
  //
  // you don't *have* to use an interrupt with a button - you could read it when you want to get the value
  // (called "polling") - this means you only can *see* a button being pressed if you *look* _while_it's being
  // pressed - look at a different time and you'll totally miss it
  //
  // an interrupt *won't* miss it - in fact you could increment a counter and count the number of times the
  // button was pressed and handle it later - that would be hard to do in a reliable way *without* interrupts  

  unsigned long interruptTime = millis();       // save the current time in milliseconds when we enter the ISR routine

  // since we're triggering the interrupt with a mechanical button, we have to consider "bounce"
  //
  // this is when a button or other contact doesn't make a super clean, one shot electrical contact and "bounces" some
  // as it's opening or closing - sort of like sparking
  //
  // this isn't a problem for a light switch but due to the speed of the microcontroller, we can see those "bounces"
  // as unwanted activations resulting in unwanted calls to our interrupt routine
  //
  // we fix these through a strategy called "de-bouncnig" - once we see a signal, we disregard other signals
  // for a long enough period of time to get through the bouncing time (which is typically only a few milliseconds)
  // before we pay attention to them again
  //
  // in this case, we don't do anything in this routine if it's happening too fast and just return which
  // effectively ignores them
  //
  // one thing is that this works fine if you just press the button and let it go - if you hold it too long,
  // any bouncing looks like more deliberate pressing so to prevent that, just press it and let it go!
  
  if (interruptTime - LastISRTime > DEBOUNCE_MILLISECS) {
    
    LedState = ! LedState;                        // flip it off to on or on to off

    digitalWrite(LED_PIN, LedState);
  }
  
  LastISRTime = interruptTime;
}


void setup() {

  // setup the servo object
  DowServo.attach(SERVO_PIN);
  
  // setup the LED pin - just a regular digital output
  pinMode(LED_PIN, OUTPUT);
  digitalWrite(LED_PIN, LedState);
  
  // setup the button pin - it should be pulled high since the button closing pulls it down
  pinMode(BUTTON_PIN, INPUT_PULLUP);
  
  // this should cause an interrupt when the input line "falls" - goes from "high" to "low"attachInterrupt(digitalPinToInterrupt(BUTTON_PIN), ISR, FALLING);
  attachInterrupt(digitalPinToInterrupt(BUTTON_PIN), ButtonISR, FALLING);

  // make sure interrupts are enabled (they should be by default)
  interrupts();
}

void loop() {

int degrees;

  // sweep from 0-180 degree at 20 degrees per second
  for (degrees = 0; degrees <= 180 ; degrees++) {
    DowServo.write(degrees);  // set servo position
    delay(50);               // wait 1/20th of a second
  }

  delay(1000);                // we reached 180 so wait for one second

  DowServo.write(90);         // move to the middle of the range

  while (1);                  // spin forever, we're done
}
