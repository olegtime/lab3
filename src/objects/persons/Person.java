package objects.persons;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Person person){
        if (person == null) return false;
        if (this.getClass() != person.getClass()) return false;
        if (name.equals(person.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.length();
    }

    public String toString(){
        return name;
    }
}
