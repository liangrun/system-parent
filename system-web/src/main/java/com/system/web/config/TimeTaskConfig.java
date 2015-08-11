package com.system.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class TimeTaskConfig {

	public TestTimeTask task() {
		return new TestTimeTask();
	}
}
