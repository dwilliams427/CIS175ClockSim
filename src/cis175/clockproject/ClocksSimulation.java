package cis175.clockproject;

import static cis175.clockproject.Clock_Interface.CLOCK_TYPE.*;

import java.util.ArrayList;

public class ClocksSimulation {

    /**
     * Runs the clocks simulation for the parameter specified number of ticks.
     * Comments marked "DONE:" were "TO_DO:" items based on the project workflow specs.
     *
     * @param runTicks number of ticks to run simulation for.
     */
    public void run(long runTicks) {

    /*
    DONE:   Create collection of clocks, initializing each as follows:
            1) Time = [00:00:00]
            2) Seconds per tick = 1
            3) Drift per second = Value defined in Table 1
    */

        SundialClock clock1;
        CuckooClock clock2;
        GrandfatherClock clock3;
        WristClock clock4;
        AtomicClock clock5;

        // DONE: Put clocks into a collection and refactor code to use that construct.
        
        ArrayList<Clock> clockList = new ArrayList<Clock>();			// arraylist of Clock objects
        
        //Version 1
//        clock1 = new SundialClock(SUNDIAL, 0, 0.0, "Sundial Clock");
//        clock2 = new CuckooClock(CUCKOO, 0, 0.000694444, "Cuckoo Clock");
//        clock3 = new GrandfatherClock(GRANDFATHER, 0, 0.000347222, "Grandfather Clock");
//        clock4 = new WristClock(WRIST, 0, 0.000034722, "Wrist Clock");
//        clock5 = new AtomicClock(ATOMIC, 0, 0.0, "Atomic Clock");
        
        //Version 2
        clockList.add(new SundialClock(SUNDIAL, 0, 0.0, "Sundial Clock"));
        clockList.add(new CuckooClock(CUCKOO, 0, 0.000694444, "Cuckoo Clock"));
        clockList.add(new GrandfatherClock(GRANDFATHER, 0, 0.000347222, "Grandfather Clock"));
        clockList.add(new WristClock(WRIST, 0, 0.000034722, "Wrist Clock"));
        clockList.add(new AtomicClock(ATOMIC, 0, 0.0, "Atomic Clock"));

        // DONE: Display time of each clock before clocks runs.

        System.out.println();
        System.out.println("Reported clock times after resetting:");
        System.out.println("=====================================");   
        
        for (int i=0; i < clockList.size(); i++) {
        	clockList.get(i).displayTime();        	
        }
//        clock1.displayTime();
//        clock2.displayTime();
//        clock3.displayTime();
//        clock4.displayTime();
//        clock5.displayTime();

        /*
        DONE: Perform 604,800 ticks (1 week) per clock in the collection.
        Note that this number is supplied by the runTicks parameter.
        */
        System.out.println();
        System.out.println("Running the clocks for one (1) week...");
        
        for (int i=0; i < runTicks; i++) {
        	clockList.get(0).tick();
        	clockList.get(1).tick();
        	clockList.get(2).tick();
        	clockList.get(3).tick();
        	clockList.get(4).tick();            	
        }
        
//        for (long i = 0; i < runTicks; i++) {
//            clock1.tick();
//            clock2.tick();
//            clock3.tick();
//            clock4.tick();
//            clock5.tick();
//        }

        // DONE: Display time of each clock after clocks run.

        System.out.println();
        System.out.println("Reported clock times after running:");
        System.out.println("===================================");
        
        for (int i=0; i < clockList.size(); i++) {
        	clockList.get(i).displayTime();        	
        }
//        clock1.displayTime();
//        clock2.displayTime();
//        clock3.displayTime();
//        clock4.displayTime();
//        clock5.displayTime();

        // DONE: Destroy collection of clocks.
        				
        for (int i=0; i < clockList.size(); i++) {		// destroy references to objects
        	clockList.remove(i);       	
        }
        
        System.gc();    								// request object cleanup from JVM garbage collector

        return;
    }
}