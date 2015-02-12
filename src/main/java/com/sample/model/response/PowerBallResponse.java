package com.sample.model.response;

import java.util.Set;

public class PowerBallResponse {

	// Set variable for holding unique lottery numbers
	private Set<Integer> numbers;
	// powerBall number
	private Integer powerBall;

	public Set<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}

	public Integer getPowerBall() {
		return powerBall;
	}

	public void setPowerBall(Integer powerBall) {
		this.powerBall = powerBall;
	}

}
