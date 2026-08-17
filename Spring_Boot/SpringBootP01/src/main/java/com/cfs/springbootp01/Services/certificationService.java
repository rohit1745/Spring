package com.cfs.springbootp01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class certificationService {


    private notificationService notificationService;



    @Autowired
    //setter dependancy Injection
    public void setNotificationService(notificationService notificationService) {
        this.notificationService = notificationService;
    }


    public notificationService getNotificationService()
    {
        return notificationService;
    }


    public void sendCertificate()
    {
        System.out.println("Certificate is Ready.........");
        notificationService.sendNotification();
    }
}

