package com.tts.day3.dealership;

public class LightTruck extends Vehicle {

//    keep  in mind that whenever we create a class
//    we can use them  as types

    public class TransferCase {

        private int numGears;

        public TransferCase() {
            this.numGears =  4;
        }

        public TransferCase(int gears) {
            this.numGears = gears;
        }

        public int getNumGears() {
            return numGears;
        }

    }
// this  lightTruck has a property/field
// that is of type Transfer case
    public TransferCase transferCase;
    public boolean is4WD;
    public Integer amountOfWheels;

    public LightTruck(boolean is4WD) {

        this.is4WD = is4WD;
        if (this.is4WD == true) {
            this.transferCase = new TransferCase();
        }
        this.transferCase = transferCase;
    }

}
