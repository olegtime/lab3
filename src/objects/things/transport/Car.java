package objects.things.transport;

import objects.places.Place;
import objects.things.Thing;

public class Car extends GroundTransport {

    public Car(String name){
        super(name);
    }

    @Override
    public void jumpOnSomewhere(Thing thing, Place place){
        System.out.println(this.getName() + " запрыгал по " + thing.getName() + " " + place.getName());
    }

    @Override
    public void rideOnSomewhere(Thing thing, Place place){
        System.out.println(this.getName() + " поехал по " + thing.getName() + " " + place.getName());
    }

    @Override
    public void drift(){
        System.out.println(this.getName() + " дрифтанул люто ");
    }
}
