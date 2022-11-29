package objects.places;

public class Place {
    private String name;

    public Place(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Place place){
        if (place == null) return false;
        if (this.getClass() != place.getClass()) return false;
        if (name.equals(place.getName())) return true;
        return false;
    }

    public int hashCode(){
        return name.length();
    }

    public String toString(){
        return name;
    }
}
