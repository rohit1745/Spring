package com.cfs.springbootp01.Services;

import org.springframework.stereotype.Service;

@Service
public class certificationService {


    private notificationService notificationService;



    //setter dependancy Injection
    public void setNotificationService(notificationService notificationService) {
        this.notificationService = notificationService;
    }


    public notificationService getNotificationService() {
        return notificationService;
    }
}

