package w12;



import w11.Person;
import w11.Student;

import java.io.IOException;

public
    class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", 1897, 534);
        Person person = student;

        person.show();

        // ======================

        Person[] arr = {
            new Student("Ala", 1977, 7456),
            new Person("Kuba", 1986),
            person,
//            new Student("Ela", 2000, 26000){
//                public void show(){
//                    System.out.println("test");
//                }
//            }
        };

        for(Person p : arr){
            System.out.println("=====");
            p.show();
//
//            if( p instanceof Student){
//                Student s = (Student) p;
//                s.sNumber = 10;
//            }
        }

        Object[] tab = {
            arr[0], arr[1], arr[2]
        };
        System.out.println("*****");
        for(Object o : tab)
            System.out.println(
                o.toString()
            );

        //=================================

        Student s1 = new Student("Ewa", 1956, 1);
        Student s2 = new Student("Ewa", 1956, 1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        // ================================

        int[] tab1 = new int[]{1,2,3};
        System.out.println(tab1[3]);


        try {
            int wrt = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
