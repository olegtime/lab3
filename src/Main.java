import objects.persons.*;
import objects.places.*;
import objects.places.spaces.*;
import objects.things.*;
import objects.enums.*;
import objects.other.*;
import objects.things.transport.*;

public class Main {
    public static void main(String[] args) {

        // Люди
        Policeman policeman = new Policeman("Полицейский");
        Driver driver = new Driver("Шофёр");
        Somebody somebody = new Somebody("Он");
        Neznayka neznayka = new Neznayka("Незнайка");
        Figel figel = new Figel("Фигль");
        Migel migel = new Migel("Мигль");

        // Предметы
        Engine engine = new Engine("Мотор");
        Cabin cabin = new Cabin("Кабина");
        Car car = new Car("Автомобиль");
        Bus bus = new Bus("Автобус");
        Stones stones = new Stones("Камни");
        Uniform uniform = new Uniform("Мундир");
        Buttons buttons = new Buttons("Пуговицы");
        Metal metal = new Metal("Металл");

        // Места
        Pavement pavement = new Pavement("Мостовая");
        PoliceDepartment policeDepartment = new PoliceDepartment("Полицейское управление");
        Air air = new Air("Воздух", true);
        BadlyVentilated badlyVentilated = new BadlyVentilated("Плохо проветриваемое помещение", false);

        // Перечисления
        PartOfHour partOfHour = PartOfHour.QUARTER;
        TypeOfService typeOfService = TypeOfService.POLICE;

        // Прочее
        It it = new It("Это");
        Service service= new Service("Служба");



        policeman.howeverIngnoring(somebody);
        policeman.sitOnSomethingNextTo(cabin, driver);
        policeman.commandTo(driver);
        engine.buzz();

        car.jumpOnSomewhere(stones, pavement);
        neznayka.beSomewhereInTime(policeDepartment, partOfHour);

        policeman.handOverSomeoneToSomeone(figel, neznayka, migel);

        policeman.beEquallyDressedIn(migel, figel, uniform);
        buttons.doNotShineBrightlyAs(uniform, migel, figel);

        it.probablyExplained();
        service.passingNotIn(migel, air);
        service.passingIn(migel, badlyVentilated);

        metal.slowlySpoil(buttons);
    }
}