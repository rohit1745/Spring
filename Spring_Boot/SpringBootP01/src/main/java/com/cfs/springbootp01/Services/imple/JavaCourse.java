package com.cfs.springbootp01.Services.imple;

import com.cfs.springbootp01.Services.CourseService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JavaCourse implements CourseService {
    @Override
    public void getCoursedetails() {
        System.out.println("Java Course Started..........");

    }
}
