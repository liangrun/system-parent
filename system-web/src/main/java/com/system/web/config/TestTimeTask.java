package com.system.web.config;

import org.springframework.scheduling.annotation.Scheduled;

public class TestTimeTask {
	
	@Scheduled(fixedRate=1000)
	public void test() {
		System.out.println("TestTimeTask-->test()");
	}

}
