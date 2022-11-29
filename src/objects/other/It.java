package objects.other;

import objects.persons.Person;

public class It {
    private String name;

    public It(String name){
        this.name = name;
    }

    public void probablyExplained() {
        System.out.println(this.name + ", по всей вероятности, объянялось тем, что ");
    }

    public String getName() {
        return name;
    }

    public boolean equals(It it){
        if (it == null) return false;
        if (this.getClass() != it.getClass()) return false;
        if (name.equals(it.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.length();
    }

    public String toString(){
        return name;
    }
}
