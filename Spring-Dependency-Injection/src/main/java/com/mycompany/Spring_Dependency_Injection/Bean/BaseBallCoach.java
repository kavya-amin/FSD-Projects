package com.mycompany.Spring_Dependency_Injection.Bean;

import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {
	
	private Fortune fortune;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice back volley today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}

}
