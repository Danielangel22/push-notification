package com.demo.notifications.push.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notifications.push.model.PushNotificationRequest;
import com.demo.notifications.push.model.PushNotificationResponse;
import com.demo.notifications.push.service.PushNotificationService;

@RestController
public class PushNotificationController {

	@Autowired
    private PushNotificationService Service;

    @PostMapping("/notification/token")
    public ResponseEntity<?> sendTokenNotification(@RequestBody PushNotificationRequest request) {
      Service.sendPushNotificationToToken(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notificacion enviada"), HttpStatus.OK);
    }


}
