package com.sample.service;

import static com.sample.util.LotteryUtil.getLotteryNumber;
import static com.sample.util.LotteryUtil.getPowerBallNumber;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sample.model.response.PowerBallResponse;

@Service
public class LotteryServiceImpl implements LotteryService {

	private final static Logger logger = Logger.getLogger(LotteryServiceImpl.class);

	/**
	 * this method returns the PowerBallResponse object with the numbers and
	 * powerBall field populated using LotteryUtil methods
	 */
	public PowerBallResponse generatePowerBallLottery() {
		logger.debug("generatePowerBallLottery() >");
		try {
			PowerBallResponse pbs = new PowerBallResponse();
			Set<Integer> numbers = new HashSet<Integer>();
			while (numbers.size() < 5) {
				numbers.add(getLotteryNumber());
			}
			// Power ball lottery has 5 lottery numbers
			pbs.setNumbers(numbers);
			// And a power ball number
			pbs.setPowerBall(getPowerBallNumber());
			return pbs;
		} finally {
			logger.debug("< generatePowerBallLottery()");
		}
	}
}
