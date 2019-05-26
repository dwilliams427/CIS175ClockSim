package cis175.clockproject;

/**
 * concrete class descended from Clock and QuantumClock with ClockInterface.
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 1.0 CIS175 Spring 2019
 */
public class AtomicClock extends QuantumClock {

	TimesConverter tc = new TimesConverter();
	ClockTime currentTime = new ClockTime();
	double totalDrift;

	public AtomicClock(CLOCK_TYPE type, long initialTime, double driftPerSecond, String clockName) {
		super(type, initialTime, driftPerSecond, clockName);
	}

	@Override
	public void reset() {
		currentTime.resetTicks();
	}

	@Override
	public void tick() {
		currentTime.incrementClockTime(driftPerSecond);
	}

	@Override
	public void displayTime() {

		long wholeSeconds = currentTime.getWholeSeconds();

		tc.updateTimeComponents(wholeSeconds);

		System.out.printf("%-17s", clockName); // left justify name
		System.out.print(" time [");

		long hours24H = tc.getHours();
		long minutes24H = tc.getMinutes();
		long seconds24H = tc.getSeconds();

		// adjust for military/24-hour clock display per project specs
		if ((hours24H == 0) && (minutes24H == 0) && (seconds24H == 0) && (wholeSeconds > 3600)) {
			hours24H = 24;
		}

		System.out.printf("%02d:%02d:%02d", hours24H, minutes24H, seconds24H);

		// calculate and display the difference between drifted and non-drifted seconds.
		totalDrift = (currentTime.getTicks() - tc.getOriginalNumberOfSeconds());

		System.out.printf("] - total drift = %f seconds", totalDrift);
		System.out.println();

	}
}