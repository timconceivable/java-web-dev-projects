package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD();
        DVD myDvd = new DVD();
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
        myDvd.playMedia();
        // System.out.println(myDvd.getClass().getName() );
    }
}