public class test {
    public static void main(String[] args) {


        Student s= Student.getInstance();
        System.out.println(s);
        Student s2= Student.getInstance();
        System.out.println(s2);
    }
}
