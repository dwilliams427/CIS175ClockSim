package cis175.clockproject;

/**
 * Converts a long value of seconds to its composite weeks, days, hours, minutes, and (remaining) seconds values.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public class TimesConverter implements Time_Constants {

    long originalNumberOfSeconds;

    long weeksFromSeconds;
    long daysFromSeconds;
    long hoursFromSeconds;
    long minutesFromSeconds;
    long secondsRemaining;

    /**
     * Default Constructor method.
     */
    TimesConverter() {
        this.updateTimeComponents(0);
    }

    /**
     * Takes a given number of seconds and converts it into its component time units.
     * Instance variables for weeks, days, hours, minutes, and (remaining) seconds can them be accessed by Getters.
     *
     * @param _secs long - number of seconds to be converted into its component time units.
     */
    public void updateTimeComponents(long _secs) {

        originalNumberOfSeconds = _secs;

        weeksFromSeconds = _secs / SECONDS_PER_WEEK;
        _secs -= (weeksFromSeconds * SECONDS_PER_WEEK);

        daysFromSeconds = _secs / SECONDS_PER_DAY;
        _secs -= (daysFromSeconds * SECONDS_PER_DAY);

        hoursFromSeconds = _secs / SECONDS_PER_HOUR;
        _secs -= (hoursFromSeconds * SECONDS_PER_HOUR);

        minutesFromSeconds = _secs / SECONDS_PER_MINUTE;
        _secs -= (minutesFromSeconds * SECONDS_PER_MINUTE);

        secondsRemaining = _secs;
        _secs -= (secondsRemaining);

        if (_secs != 0) {
            System.err.println("*** Error: Time conversion of " + originalNumberOfSeconds + " resulted in (" + _secs + ") excess seconds. ***");
        }
    }

    /**
     * Getter method for weeksFromSeconds.
     *
     * @returns number of weeks.
     */
    public long getWeeks() {
        return weeksFromSeconds;
    }

    /**
     * Getter method for daysFromSeconds.
     *
     * @returns number of days.
     */
    public long getDays() {
        return daysFromSeconds;
    }

    /**
     * Getter method for hoursFromSeconds.
     *
     * @returns number of hours.
     */
    public long getHours() {
        return hoursFromSeconds;
    }

    /**
     * Getter method for minutesFromSeconds.
     *
     * @returns number of minutes.
     */
    public long getMinutes() {
        return minutesFromSeconds;
    }

    /**
     * Getter method for secondsRemaining.
     *
     * @returns number of (remaining) seconds.
     */
    public long getSeconds() {
        return secondsRemaining;
    }

    /**
     * Standard Getter method.
     *
     * @returns original number of seconds used as argument for update() method.
     */
    public long getOriginalNumberOfSeconds() {
        return originalNumberOfSeconds;
    }

}
