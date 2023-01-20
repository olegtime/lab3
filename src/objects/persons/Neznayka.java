package objects.persons;

import interfaces.*;
import objects.enums.PartOfHour;
import objects.exceptions.*;
import objects.places.*;

public class Neznayka extends Person {
    public Neznayka(String name) {
        super(name);
    }

    public void beSomewhereInTime(Place place, PartOfHour partOfHour, PartOfHourToMinutes partOfHourToMinutes) {
        System.out.println("Через " + partOfHourToMinutes.interpretationToMinuts(partOfHour) + " минут " + this.getName() + " был в " + place.getName());
    }

    public void tryToEscape(PrisonRoomComponent prisonRoomComponent){
        System.out.print(this.getName() + " изо всех сил ");
        new Fist("Кулак").knockTo(prisonRoomComponent);
        System.out.print(" и ");
        scream();
    }

    public void scream(){
        System.out.println("закричал");
    }

    public void standUpFrom(Place place){
        System.out.println(this.getName() + " поднялся с " + place.getName());
    }

    public void tryToOpen(PrisonRoomComponent door) throws NotADoorException {
        if (!door.getType().equals(new PrisonRoomComponent.Door("Pattern").getType())){
            throw new NotADoorException("Незнайка ошибся объектом открытия");
        }
        System.out.print(this.getName());
        new Shoulder("Плечо").lieDown(door);
    }

    public void understand(boolean isHaveTime){
        class What {
            public final String NAME = "Что";
            public void happened(){
                System.out.println(this.NAME + " произошло ");
            }
        }
        try {
            haveTime(isHaveTime);
        }
        catch (NotHaveATimeException e){
            System.out.print(e.getMessage());
        }
        finally {
            System.out.print(this.getName() + " сообразить ");
            new What().happened();
        }
    }

    public void haveTime(boolean isHaveTime) throws NotHaveATimeException{
        if (!isHaveTime){
            throw new NotHaveATimeException("Не успел ");
        }
        System.out.print("Успел ");
    }

    private class Fist {
        private String name;
        public Fist(String name){
            this.name = name;
        }
        public void knockTo(PrisonRoomComponent prisonRoomComponent){
            System.out.print("забарабанил в " + prisonRoomComponent.getName() + " " + this.name + "ом");
        }
    }

    private class Shoulder {
        private String name;
        public Shoulder(String name){
            this.name = name;
        }

        public void lieDown(PrisonRoomComponent prisonRoomComponent){
            System.out.println(" приналег на " + prisonRoomComponent.getName() + " " + this.name + "м");
        }
    }
}
