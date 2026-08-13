package org.cfs;

public class Student {
    Courses courses;



    Student()
    {

    }
    Student(Courses courses)
    {
        this.courses=courses;
    }


    public void setCourses(Courses courses)
    {
        this.courses=courses;
    }

    void Learn()
    {
        System.out.println("Today Class is Stated.....");
        courses.start();
    }
}
