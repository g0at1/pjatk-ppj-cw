package wyklad.w11;

public
    class Person {

    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(int birthYear) {
        this.birthYear = birthYear;
    }

    public void show(){
        System.out.println(
            "Person: "+name+" "+birthYear
        );
    }
}
