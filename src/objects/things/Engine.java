package objects.things;

public class Engine extends Thing{

    public Engine(String name){
        super(name);
    }
    public void buzz(){
        System.out.println(this.getName() + " загудел");
    }

}
