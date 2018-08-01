package com.vikhi.practice.clock;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.vikhi.practice.pojo.Time;
import com.vikhi.practice.throwable.InvalidTimeFormatException;
import com.vikhi.practive.util.TimeUtil;

public class BerlinClockBehaviorSteps {

	Clock clock = null;
	
	String displayValStr = null;
	
	@Given("the clock is turned $switch")
	public void givenBerlinClock(@Named ("switch") String switchStatus) {
		clock = new BerlinClock();
		if (switchStatus != null && switchStatus.equalsIgnoreCase("ON")) {
			clock.turnClockOn();
		} else {
			clock.turnClockOff();
		}
	}
	
	@When("the time is '$timeStr'") 
	public void whenTheTimeis(@Named ("timeStr") String timeString) throws InvalidTimeFormatException {
		Time myTime = TimeUtil.getTimeFromString(timeString);
		displayValStr = clock.getClockDisplayVal(myTime);
	}
	
	@Then("the display lights will be of pattern '$displayValue'")
	public void thenThePattern(@Named("displayValue") String displayValStr) {
		Assert.assertNotNull(this.displayValStr);
		Assert.assertEquals(this.displayValStr, displayValStr);
	}
}
