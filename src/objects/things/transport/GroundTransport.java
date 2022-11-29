package objects.things.transport;

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
}
