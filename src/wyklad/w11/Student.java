package wyklad.w11;

public
    class Student
    extends Person {

    protected int sNumber;

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
        super.show();
        System.out.println(
            "Student: sNumber("+this.sNumber+") "+
           "name("+super.name+") "+
           "birthYear("+birthYear+")"
        );
    }
}
