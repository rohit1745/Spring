package com.cfs.springbootp01.Services;

import org.springframework.stereotype.Service;

@Service
public class notificationService {
    void sendNotification()
    {
        System.out.println("Notification send to Student");
    }
}
