package org.cfs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("Bean.xml");


        //getting Student obj
//        Student std =Context.getBean(Student.class);
//        std.Learn();



    }
}
