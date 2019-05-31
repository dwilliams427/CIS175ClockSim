package cis175.clockproject;

import static cis175.clockproject.Clock_Interface.CLOCK_TYPE.*;

/**
 * abstract class - root class of all other simulated clock classes.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public abstract class Clock implements Clock_Interface {

    /**
     * Declares enumerated variable used by constructor. Not used elsewhere at this time. 
     */
    CLOCK_TYPE type;
    
    /**
     * Declares ClockTime object used by constructor. Not used elsewhere at this time.
     */
    ClockTime initialTime;
    
    /**
     * Declares double variable used by constructor and concrete tick() methods.
     */
    double driftPerSecond;
    
    /**
     * Declares String variable used by constructor and concrete displayTime() methods.
     */
    String clockName;

    // parameterized constructor
    public Clock(CLOCK_TYPE _type,
                 long _initialTime,
                 double _driftPerSecond,
                 String _clockName) {

        type = _type;
        // initialTime.setTicks(_initialTime);
        driftPerSecond = _driftPerSecond;
        clockName = _clockName;
    }

}
