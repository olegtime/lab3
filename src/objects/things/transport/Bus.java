package objects.things.transport;

import objects.places.Place;
import objects.things.Thing;

public class Bus extends GroundTransport{

    public Bus(String name){
        super(name);
    }

    @Override
    public void jumpOnSomewhere(Thing thing, Place place){
        System.out.println(this.getName() + " попытася попрыгать по " + thing.getName() + " " + place.getName());
    }

    @Override
    public void rideOnSomewhere(Thing thing, Place place){
        System.out.println(this.getName() + " неспешно поехал по " + thing.getName() + " " + place.getName());
    }

    @Override
    public void drift(){
        System.out.println(this.getName() + " дрифтанул и чуть не перевернулся ");
    }
}
