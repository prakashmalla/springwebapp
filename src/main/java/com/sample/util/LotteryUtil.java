package com.sample.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Utility methods for lottery services
 * @author pmalla
 *
 */
public class LotteryUtil {

	private static final int LOWER_BOUND = 1; // Lower bound inclusive value of lottery numbers
	private static final int UPPER_BOUND = 60; // Upper bound exclusive value of lottery numbers
	private static final int PB_UPPER_BOUND = 36; // Upper bound exclusive value of power ball

	/**
	 * This method returns a number between 1 and 60, 1 being inclusive and 60
	 * being exclusive by using ThreadLocalRandom in multi-threaded access
	 * 
	 * @return
	 */
	public static int getLotteryNumber() {
		return ThreadLocalRandom.current().nextInt(LOWER_BOUND,
				UPPER_BOUND);
	}

	/**
	 * This method returns a number between 1 and 36, 1 being inclusive and 36
	 * exclusive by using ThreadLocalRandom in multi-threaded access
	 * 
	 * @return
	 */
	public static int getPowerBallNumber() {
		return ThreadLocalRandom.current().nextInt(LOWER_BOUND,
				PB_UPPER_BOUND);
	}

}
