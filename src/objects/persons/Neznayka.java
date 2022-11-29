package objects.persons;

import interfaces.*;
import objects.enums.PartOfHour;
import objects.places.*;

public class Neznayka extends Person implements Wasable {
    public Neznayka(String name){
        super(name);
    }

    @Override
    public void was(){
        System.out.print(" был в ");
    }
    public void beSomewhereInTime(Place place, PartOfHour partOfHour){
        System.out.print("Через " + partOfHour.getTranslate() + " " + this.getName());
        was();
        System.out.println(place.getName());
    }
}
