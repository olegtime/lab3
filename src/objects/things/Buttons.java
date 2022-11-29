package objects.things;

import objects.persons.*;

public class Buttons extends Thing{
    public Buttons(String name){
        super(name);
    }

    public void doNotShineBrightlyAs(Thing thing, Person person1, Person person2){
        System.out.println(this.getName() + " на " + thing.getName() + " " + person1.getName() +
                " не отличались таким ярким блеском, как " + this.getName() + " на " + thing.getName() +
                " " + person2.getName());
    }
}
