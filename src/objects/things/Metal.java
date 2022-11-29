package objects.things;

import objects.things.*;


public class Metal extends Thing{
    public Metal(String name){
        super(name);
    }

    public void coatingWithOxides(){
        System.out.print("покрывался окислами");
    }

    public void fade(){
        System.out.println("тускнел");
    }

    public void slowlySpoil(Thing thing){
        System.out.print(this.getName());
        thing.toBeMadeOf();
        System.out.print("постепенно ");
        coatingWithOxides();
        System.out.print(" и ");
        fade();
    }
}
