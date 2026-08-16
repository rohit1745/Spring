package com.cfs.springbootp01.Services;

import org.springframework.stereotype.Service;

@Service
public class studentService {

        private final CourseService courseService;
        private final paymentService paymentService;

    public studentService(CourseService courseService, paymentService paymentService) {
        this.courseService = courseService;
        this.paymentService = paymentService;
    }


    void enrollStudent()
    {
        System.out.println("Student Enroll Started......");
        courseService.getCoursedetails();
        paymentService.doPayment();
        System.out.println("Student Enroll Successfully.............");
    }
}
