package cis175.clockproject;

/**
 * Concrete class used as a "smart" encapsulated variable to represent elapsed moments of time for a clock object.
 * For purposes of this simulation one tick represents one second of elapsed time if {@link Clock#driftPerSecond} is zero.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public class ClockTime {

    public Time_Constants timeValues = new TimesConverter();

    /**
     * long Holds the current number of clock-cycles for this clock object.
     */
    private long ticks;

    /**
     * double Holds the simulated elapsed time in fractional seconds for this clock object.
     *
     * @see Clock#driftPerSecond
     */
    private double seconds;

    /**
     * Standard Getter method.
     *
     * @returns current time in ticks.
     */
    public long getTicks() {
        return ticks;
    }

    /**
     * Standard Setter method.
     *
     * @param ticks long int quantity of seconds
     */
    public void setTicks(long ticks) {
        this.ticks = ticks;
    }

    /**
     * Variant Setter method, it always sets ticks to zero.
     */
    public void resetTicks() {
        this.ticks = 0;
    }

    /**
     * Variant Setter method, it always increases ticks by exactly one.
     */
    public void incrementClockTime(double _driftPerSecond) {
        ++this.ticks;
        this.setRealSeconds(_driftPerSecond);
    }

    /**
     * Standard Getter method.
     *
     * @returns the simulated elapsed time in fractional seconds.
     * @see Clock#driftPerSecond
     */
    public double getSeconds() {
        return this.seconds;
    }

    /**
     * Variant Getter method, truncates fractional seconds into a whole (long) number.
     *
     * @returns the simulated elapsed time in whole seconds.
     * @see Clock#driftPerSecond
     */
    public long getWholeSeconds() {
        return (long) (this.seconds/1);
    }

	//    /**
	//     * Standard Setter method.
	//     *
	//     * @param simulatedSeconds the simulated elapsed time in fractional seconds.
	//     * @see Clock#driftPerSecond
	//     */
	//    public void setSeconds(double simulatedSeconds) {
	//        this.seconds = simulatedSeconds;
	//    }

    /**
     * Variant Setter method, calculates the simulated elapsed time using this clock's {@link Clock#driftPerSecond} value.
     * @param currentDrift use this clock's {@link Clock#driftPerSecond} value.
     */
    public void setRealSeconds(double _driftPerSecond) {
            this.seconds = ticks - (ticks * _driftPerSecond);
        };

}
