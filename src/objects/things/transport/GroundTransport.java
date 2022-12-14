package objects.things.transport;

import objects.persons.Person;
import objects.places.Place;
import objects.things.Thing;

public abstract class GroundTransport extends Thing {
    private String name;
    public GroundTransport(String name){
        super(name);
    }

    public abstract void jumpOnSomewhere(Thing thing, Place place);
    public abstract void rideOnSomewhere(Thing thing, Place place);
    public abstract void drift();

    public boolean equals(GroundTransport groundTransport){
        if (groundTransport == null) return false;
        if (this.getClass() != groundTransport.getClass()) return false;
        if (name.equals(groundTransport.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.length();
    }

    public String toString(){
        return name;
    }
}
