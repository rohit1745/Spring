package Coupling;

public class Student {

        DSA d=new DSA();

        Java j=new Java();


        void learn()
        {
            System.out.println("learning Started");
            d.start();
            j.start();
        }
    }

