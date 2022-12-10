package objects.persons;

import interfaces.*;
import objects.things.*;


public class Policeman extends Person implements Nameable {

    public Policeman(String name){
        super(name);
    }

    public void howeverIngnoring(Person person){
        System.out.println(this.getName() + ", однако, не удостоил " + person.getName() + " ответом");
    }

    public void sitOnSomethingNextTo(Thing thing, Person person){
        System.out.println(this.getName() + " сел в " + thing.getName() + " рядом с " + person.getName());
    }
    public void commandTo(Person person){
        System.out.println(this.getName() + " скомандовал " + person.getName());
    }

    @Override
    public void named(Person person){
        System.out.print(" которого звали " + person.getName());
    }

    public void handOverSomeoneToSomeone(Person person1, Person person2, Person person3){
        System.out.print(this.getName());
        named(person1);
        System.out.print(" сдал " + person2.getName() + " с рук на руки другому " + this.getName());
        named(person3);
        System.out.println();
    }

    public void beEquallyDressedIn(Person person1, Person person2, Thing thing){
        System.out.println(this.getName() + " " + person1.getName() + " был одет в такой же " + thing.getName() + " что и " + person2.getName());
    }
}
