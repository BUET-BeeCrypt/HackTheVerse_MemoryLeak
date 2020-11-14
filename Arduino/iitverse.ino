 #include<Stepper.h>
int Incoming;
const int stepsPerRevolution = 200;
 Stepper myStepper(stepsPerRevolution, 8, 10, 9, 11);
void setup() {
    Serial.begin(9600);
    myStepper.setSpeed(60);
}

void loop() {
    // put your main code here, to run repeatedly:
    while( Serial.available() > 0 ){
            Incoming = Serial.parseInt();
           
            Incoming=Incoming%10;
            Serial.print(Incoming);
            Serial.print("\n");
            if(Incoming == 1 ) {
                myStepper.step(100);
                }
            else {
                Serial.print("neg");
                myStepper.step(100);
                }
        }  

}
