package com.hugui.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 
 * @author hugui
 * @description 工程启动类
 * 2017年8月4日
 */

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashBoardApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(HystrixDashBoardApplication.class, args);
		
	}
	
}
