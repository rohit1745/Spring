package org.cfs;

public class Student {
    Courses courses;            //field / property



    Student()
    {
        System.out.println("Student Default Constructor");
    }
    Student(Courses courses)
    {
        System.out.println("Using Constructor");
        this.courses=courses;
    }


    public void setCourses(Courses courses)
    {
        System.out.println("Using seter");
        this.courses=courses;
    }

    void Learn()
    {
        System.out.println("Today Class is Stated.....");
        courses.start();
    }
}
