package com.demo.notifications.push.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.notifications.push.firebase.FCMService;
import com.demo.notifications.push.model.PushNotificationRequest;

import java.util.concurrent.ExecutionException;

@Service
public class PushNotificationService {

	private Logger logger = LoggerFactory.getLogger(PushNotificationService.class);
	@Autowired
	private FCMService fcmService;

	public void sendPushNotificationToToken(PushNotificationRequest request) {
		try {
			
			fcmService.sendMessageToToken(request);
			
		} catch (InterruptedException | ExecutionException e) {
			logger.error(e.getMessage());
		}
	}

}
