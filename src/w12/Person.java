package w12;

import java.util.Objects;

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

    public String toString(){
        return super.toString()+" Person("+name+" "+birthYear+")";
    }

    public boolean equals(Person p){
        if(p == null)
            return false;
        if(this == p)
            return true;
        return this.name.equals(p.name)
            && this.birthYear == p.birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name);
    }

    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
