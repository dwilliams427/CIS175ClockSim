package cis175.clockproject;

import static cis175.clockproject.Clock_Interface.CLOCK_TYPE.*;

/**
 * Declares three abstract methods to be implemented by all concrete subclasses.
 * Also defines the enumerated CLOCK_TYPE constants used by the Clock constructor.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public interface Clock_Interface {
	
	/**
     * Defines enumerated type used in implementation of concrete objects which are subclasses of Clock.
     */
    enum CLOCK_TYPE {
        SUNDIAL, CUCKOO, GRANDFATHER, ATOMIC, WRIST
    }

    /**
     * sets the time to zero.
     *
     */
    void reset();

    /**
     * increments the tick counter by one.
     *
     */
    void tick();

    /**
     * displays the elapsed time using formatted print statements.
     *
     */
    void displayTime();
}
