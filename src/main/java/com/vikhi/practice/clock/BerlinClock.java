package com.vikhi.practice.clock;

import static com.vikhi.practice.util.Constants.SEPARATOR_HYPHEN;

import java.util.stream.IntStream;

import org.apache.commons.lang.StringUtils;

import com.vikhi.practice.pojo.Light;
import com.vikhi.practice.pojo.Time;
import com.vikhi.practice.util.TimeUtil;

public class BerlinClock implements Clock {

	private boolean isTurnedOn;
	
	private String secondsLight = StringUtils.EMPTY;
	
	private String firstRow = StringUtils.EMPTY;
	
	private String secondRow = StringUtils.EMPTY;
	
	private String thirdRow = StringUtils.EMPTY;
	
	private String fourthRow = StringUtils.EMPTY;
	
	@Override
	public void turnClockOn() {
		this.isTurnedOn = true;
	}

	@Override
	public void turnClockOff() {
		this.isTurnedOn = false;
	}

	@Override
	public String getClockDisplayVal(Time time) {

		if (null != time) {
			if (TimeUtil.isMidnight(time)) { 
				return (this.isTurnedOn ? "Y-RRRR-RRRR-OOOOOOOOOOO-OOOO" :
					"O-OOOO-OOOO-OOOOOOOOOOO-OOOO");
			} else {
				
				this.secondsLight = (this.isTurnedOn && time.getSecond()%2 == 0) ? Light.YELLOW.toString() : Light.OFF.toString();
				
				IntStream.range(1, 5)
				.forEach(i -> {
					this.firstRow = this.firstRow + ((this.isTurnedOn && i <= time.getHour()/5) ? 
							Light.RED.toString() : Light.OFF.toString());
					this.secondRow = this.secondRow + ((this.isTurnedOn && i <= time.getHour()%5) ? 
							Light.RED.toString() : Light.OFF.toString());
					this.fourthRow = this.fourthRow + ((this.isTurnedOn && i <= time.getMinute()%5) ? 
							Light.YELLOW.toString() : Light.OFF.toString());
				});
				
				IntStream.range(1, 12)
				.forEach(i -> 
					this.thirdRow = this.thirdRow + ((this.isTurnedOn && i <= time.getMinute()/5) ? 
							((i%3 > 0) ? Light.YELLOW.toString() : Light.RED.toString()) : Light.OFF.toString()));
				
			}
		}
		
		return (this.secondsLight + SEPARATOR_HYPHEN + 
				this.firstRow + SEPARATOR_HYPHEN + 
				this.secondRow + SEPARATOR_HYPHEN + 
				this.thirdRow + SEPARATOR_HYPHEN + 
				this.fourthRow);
	}

}
