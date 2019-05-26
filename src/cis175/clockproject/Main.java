package cis175.clockproject;

import static cis175.clockproject.Clock_Interface.CLOCK_TYPE;

/**
 * main logic section to run simulations from.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public class Main {

    public static void main(String[] args) {

        // Initialize
        ClocksSimulation fiveClocks = new ClocksSimulation();

        // Execute
        fiveClocks.run(604800);  // Perform 604,800 ticks (1 week) per clock in the collection.
        System.out.println();
        
        // Terminate
        fiveClocks = null;	// destroy object reference
        System.gc();    	// request object cleanup from JVM garbage collector

    }

}



/*
-----------------------------------------------------------------------------
Reported clock times after resetting:
=====================================
Sundial Clock time [00:00:00] - total drift = 0 seconds
Cuckoo Clock time [00:00:00] - total drift = 0 seconds
Grandfather Clock time [00:00:00] - total drift = 0 seconds
Wrist Clock time [00:00:00] - total drift = 0 seconds
Atomic Clock time [00:00:00] - total drift = 0 seconds

Running the clocks for one (1) week...

Reported clock times after running:
===================================
Sundial Clock time [24:00:00] - total drift = 0 seconds
Cuckoo Clock time [24:00:00] - total drift = 420 seconds
Grandfather Clock time [24:00:00] - total drift = 210 seconds
Wrist Clock time [24:00:00] - total drift = 20.9999 seconds
Atomic Clock time [24:00:00] - total drift = 0 seconds
-----------------------------------------------------------------------------
 */

