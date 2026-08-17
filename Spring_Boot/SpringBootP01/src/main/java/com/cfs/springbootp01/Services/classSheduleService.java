package com.cfs.springbootp01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class classSheduleService {


    @Autowired
    //field injection
   private notificationService notificationService;

    void SendClassNotification()
    {
        System.out.println("Class Sheduling..............");
        notificationService.sendNotification();
    }
}
