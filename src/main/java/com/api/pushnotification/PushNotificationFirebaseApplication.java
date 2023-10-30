package com.api.pushnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class PushNotificationFirebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushNotificationFirebaseApplication.class, args);
	System.out.println("My Push Notification");
	}

}
