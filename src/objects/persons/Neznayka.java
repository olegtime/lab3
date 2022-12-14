package objects.persons;

import interfaces.*;
import objects.enums.PartOfHour;
import objects.places.*;

public class Neznayka extends Person{
    public Neznayka(String name){
        super(name);
    }

    public void beSomewhereInTime(Place place, PartOfHour partOfHour, PartOfHourToMinuts partOfHourToMinuts){
        System.out.println("Через " + partOfHourToMinuts.interpretationToMinuts(partOfHour) + " минут " + this.getName() + " был в" + place.getName());
    }
}
