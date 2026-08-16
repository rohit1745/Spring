package com.cfs.springbootp01.Services.imple;

import com.cfs.springbootp01.Services.CourseService;
import org.springframework.stereotype.Service;

@Service
public class DSACourse implements CourseService {
    @Override
    public void getCoursedetails() {
        System.out.println("DSA Course Started..........");
    }
}
