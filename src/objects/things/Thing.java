package objects.things;

import objects.persons.Person;

public class Thing {
    private String name;

    public Thing(String name){
        this.name = name;
    }

    public void toBeMadeOf(){
        System.out.print(" из которого были сделаны " + this.getName() + " ");
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Thing thing){
        if (thing == null) return false;
        if (this.getClass() != thing.getClass()) return false;
        if (name.equals(thing.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public String toString(){
         return name;
    }

}
