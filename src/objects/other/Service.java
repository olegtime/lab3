package objects.other;

import objects.enums.*;
import objects.persons.*;
import objects.places.spaces.*;

public class Service{

    private String name;
    private String type;

    public Service(String name){
        this.name = name;
        this.type = TypeOfService.UNDEFINED.getTranslate();
    }

    public Service(String name, TypeOfService typeOfService){
        this.name = name;
        this.type = typeOfService.getTranslate();
    }

    public void passingIn(Person person, Space space){
        System.out.print(this.name + " " + person.getName() + " протекала в");
        System.out.print(space.IsItOpen() ? " открытом " : " закрытом ");
        System.out.println(space.getName());
    }

    public void passingNotIn(Person person, Space space){
        System.out.print(this.name + " " + person.getName() + " протекала не на");
        System.out.print(space.IsItOpen() ? " открытом " : " закрытом ");
        System.out.println(space.getName());
    }

    public String getName(){
        return this.name;
    }

    public String getType() { return this.type; }

    public boolean equals(Service service){
        if (service == null) return false;
        if (this.getClass() != service.getClass()) return false;
        if (name.equals(service.getName()) && type.equals(service.type)) return true;
        return false;
    }

    public int hashCode(){
        return name.length() + type.length();
    }

    public String toString(){
        return type + " " + name;
    }
}
