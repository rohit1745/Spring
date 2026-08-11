package Coupling;

public class Student {

      //  DSA d=new DSA();

        //Java j=new Java();


        Student()
        {

        }

        public void setCourse(Course course)
        {
            this.course=course;
        }


        Course course;

        Student(Course course)
        {
            this.course=course;
        }

        void learn()
        {
            System.out.println("learning Started");
            course.start();

        }
    }

