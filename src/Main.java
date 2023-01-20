import objects.exceptions.*;
import objects.persons.*;
import objects.places.*;
import objects.things.*;
import objects.enums.*;
import objects.other.*;
import objects.things.transport.*;

public class Main {
    public static void main(String[] args) {

        // Люди
        Policeman policeman = new Policeman("Полицейский");
        Policeman figel = new Policeman("Фигль");
        Policeman migel = new Policeman("Мигль");
        Neznayka neznayka = new Neznayka("Незнайка");
        Person driver = new Person("Шофёр");
        Person somebody = new Person("Он");

        // Предметы
        Engine engine = new Engine("Мотор");
        Car car = new Car("Автомобиль");
        Bus bus = new Bus("Автобус");
        Buttons buttons = new Buttons("Пуговицы");
        Metal metal = new Metal("Металл");
        Thing cabin = new Thing("Кабина");
        Thing stones = new Thing("Камни");
        Thing uniform = new Thing("Мундир");

        // Места
        PrisonRoomComponent.Door door = new PrisonRoomComponent.Door("Дверца");
        PrisonRoomComponent.DirtyFloor dirtyFloor = new PrisonRoomComponent.DirtyFloor("Грязный, заплёванный пол");
        Place pavement = new Place("Мостовая");
        Place policeDepartment = new Place("Полицейское управление");
        Space air = new Space("Воздух", true);
        Space badlyVentilated = new Space("Плохо проветриваемое помещение", false);

        // Перечисления
        PartOfHour partOfHour = PartOfHour.QUARTER;
        TypeOfService typeOfService = TypeOfService.POLICE;

        // Прочее
        It it = new It("Это");
        Service service = new Service("Служба");

//---------------------------------------------------------------------------------------------------

        // Действия
        neznayka.understand(false);
        door.shutDownFor(neznayka);
        neznayka.standUpFrom(dirtyFloor);

        try {
            neznayka.tryToOpen(door);
        //    neznayka.tryToOpen(dirtyFloor);
        }
        catch (NotADoorException e){
            System.out.println(e.getMessage());
        }

        door.doNotOpen();
        neznayka.tryToEscape(door);

        policeman.howeverIngnoring(neznayka);
        policeman.sitOnSomethingNextTo(cabin, driver);
        policeman.commandTo(driver);
        engine.buzz();

        car.jumpOnSomewhere(stones, pavement);

        neznayka.beSomewhereInTime(policeDepartment, partOfHour, (partOfHourForInterpretation) -> {
            if (partOfHourForInterpretation == PartOfHour.QUARTER) return 15;
            else if (partOfHourForInterpretation == PartOfHour.HALF) return 30;
            else if (partOfHourForInterpretation == PartOfHour.THREE_QUARTERS) return 45;
            else if (partOfHourForInterpretation == PartOfHour.ONE) return 60;
            else return 90;
        });

        policeman.handOverSomeoneToSomeone(figel, neznayka, migel);

        policeman.beEquallyDressedIn(migel, figel, uniform);
        buttons.doNotShineBrightlyAs(uniform, migel, figel);

        it.probablyExplained();
        service.passingNotIn(migel, air, () -> System.out.print(air.isOpen() ? " открытом " : " закрытом "));
        service.passingIn(migel, badlyVentilated, () -> System.out.print(badlyVentilated.isOpen() ? " открытом " : " закрытом "));

        metal.slowlySpoil(buttons);

    }
}