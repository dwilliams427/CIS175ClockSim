package cis175.clockproject;

/**
 * abstract class descended from abstract class Clock with abstract interface ClockInterface.
 * This is the parent class for all simulated clocks based on mechanical engineering.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public abstract class MechanicalClock extends Clock {

    public MechanicalClock(CLOCK_TYPE type, long initialTime, double driftPerSecond, String clockName) {
        super(type, initialTime, driftPerSecond, clockName);
    }
}
