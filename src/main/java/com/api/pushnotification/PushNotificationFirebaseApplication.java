package com.api.pushnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PushNotificationFirebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushNotificationFirebaseApplication.class, args);
	System.out.println("My Push Notification");
	}

}
