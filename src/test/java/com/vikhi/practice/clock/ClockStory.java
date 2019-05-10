package com.vikhi.practice.clock;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.SurefireReporter;
import org.jbehave.core.reporters.SurefireReporter.Options;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class ClockStory extends JUnitStory {

	@Override
	public Configuration configuration() {

		Options options = new Options(
				"TEST",  Options.DEFAULT_NAMING_STRATEGY, true, false);
		
		return new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				.useStoryReporterBuilder(new StoryReporterBuilder()
						.withSurefireReporter(new SurefireReporter(ClockStory.class, options))
						.withFormats(Format.CONSOLE));
	}
	
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), 
				new ClockBehaviorSteps());
	}
}
