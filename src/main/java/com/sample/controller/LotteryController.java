package com.sample.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.model.response.PowerBallResponse;
import com.sample.service.LotteryService;

@Controller
@RequestMapping("/lottery")
public class LotteryController {

	private final static Logger logger = Logger.getLogger(LotteryController.class);

	@Autowired
	private LotteryService lotteryService;

	@RequestMapping(value = "/powerball/generate", method = RequestMethod.GET)
	public @ResponseBody PowerBallResponse getPowerBallLottery() {
		logger.info("getPowerBallLottery() >");
		try {
			return lotteryService.generatePowerBallLottery();
		} finally {
			logger.info("< getPowerBallLottery()");
		}
	}

}
