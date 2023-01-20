package objects.places;

import objects.persons.Person;

public abstract class PrisonRoomComponent extends Place{

    private String type;
    public PrisonRoomComponent(String name, String type){
        super(name);
        this.type = type;
    }

    public static class Door extends PrisonRoomComponent{
        public Door(String name){
            super(name, "door");
        }

        public void shutDownFor(Person person){
            System.out.println(this.getName() + " за " + person.getName() + " захлопнулась");
        }

        public void doNotOpen(){
            System.out.println(this.getName() + " не открывалась");
        }
    }

    public static class DirtyFloor extends PrisonRoomComponent{
        public DirtyFloor(String name){
            super(name, "floor");
        }
    }

    public String getType(){
        return type;
    }
}
