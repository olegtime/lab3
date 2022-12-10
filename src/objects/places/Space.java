package objects.places;

public class Space extends Place {
    private boolean isOpen;

    public Space(String name, boolean isOpen){
        super(name);
        this.isOpen = isOpen;
    }
    public boolean isOpen(){
        return this.isOpen;
    }

    public boolean equals(Space space){
        if (space == null) return false;
        if (this.getClass() != space.getClass()) return false;
        if (this.getName().equals(space.getName()) && isOpen == space.isOpen()) return true;
        return false;
    }

    @Override
    public int hashCode(){
        return this.getName().length() + (isOpen ? 10 : 0);
    }

    @Override
    public String toString(){
        return (isOpen ? "Открытый " : "Закрытый ") + this.getName();
    }
}
