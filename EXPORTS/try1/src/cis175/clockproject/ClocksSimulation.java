package cis175.clockproject;

import static cis175.clockproject.Clock_Interface.CLOCK_TYPE.*;

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

        // TODO: Put clocks into a collection and refactor code to use that construct.

        clock1 = new SundialClock(SUNDIAL, 0, 0.0, "Sundial Clock");
        clock2 = new CuckooClock(CUCKOO, 0, 0.000694444, "Cuckoo Clock");
        clock3 = new GrandfatherClock(GRANDFATHER, 0, 0.000347222, "Grandfather Clock");
        clock4 = new WristClock(WRIST, 0, 0.000034722, "Wrist Clock");
        clock5 = new AtomicClock(ATOMIC, 0, 0.0, "Atomic Clock");

        // DONE: Display time of each clock before clocks runs.

        System.out.println();
        System.out.println("Reported clock times after resetting:");
        System.out.println("=====================================");        clock1.displayTime();
        clock2.displayTime();
        clock3.displayTime();
        clock4.displayTime();
        clock5.displayTime();

        /*
        DONE: Perform 604,800 ticks (1 week) per clock in the collection.
        Note that this number is supplied by the runTicks parameter.
        */
        System.out.println();
        System.out.println("Running the clocks for one (1) week...");
        for (long i = 0; i < runTicks; i++) {
            clock1.tick();
            clock2.tick();
            clock3.tick();
            clock4.tick();
            clock5.tick();
        }

        // DONE: Display time of each clock after clocks run.

        System.out.println();
        System.out.println("Reported clock times after running:");
        System.out.println("===================================");
        clock1.displayTime();
        clock2.displayTime();
        clock3.displayTime();
        clock4.displayTime();
        clock5.displayTime();

        // DONE: Destroy collection of clocks.

        clock1 = null;  // destroy references to objects
        clock2 = null;
        clock3 = null;
        clock4 = null;
        clock5 = null;
        System.gc();    // request object cleanup from JVM garbage collector

        return;
    }
}