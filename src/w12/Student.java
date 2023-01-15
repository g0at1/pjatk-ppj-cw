package w12;

public
    class Student
    extends Person {

    public int sNumber;

    public Student(
        String name, int birthYear, int sNumber
    ) {
        super(name, birthYear);
        this.sNumber = sNumber;
    }

    public Student(Person person){
        super(person.name, person.birthYear);
        this.sNumber = (int)(Math.random()*26000);
    }

    public void show(){

        System.out.println(
            "Student: sNumber("+this.sNumber+") "+
           "name("+super.name+") "+
           "birthYear("+birthYear+")"
        );
        super.show();
    }

    public String toString(){
        return super.toString()+
            " Student( "+sNumber+")";
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(obj instanceof Student) {
            Student s = (Student) obj;
            return (
                    super.equals(s)
                    && this.sNumber == s.sNumber
            );
        }
        return false;
//        if(
//            this.sNumber == s.sNumber &&
//            this.name.equals(s.name) &&
//            this.birthYear == s.birthYear
//        )
//            return true;
//        return false;
    }
}
