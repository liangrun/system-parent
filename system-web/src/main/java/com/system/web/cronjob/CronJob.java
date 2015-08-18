package com.system.web.cronjob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronJob {
	
	@Scheduled(cron="* 0/1 * * * ?")
	public void cronJobTest() {
		System.out.println("run cronJobTest");
	}
}
