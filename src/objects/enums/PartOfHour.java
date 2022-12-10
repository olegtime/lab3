package objects.enums;

public enum PartOfHour {
    QUARTER("четверть часа"),
    HALF("полчаса"),
    THREE_QUARTERS("три четверти часа"),
    ONE("час"),
    ONE_AND_HALF("полтора часа");

    private String translate;

    PartOfHour(String translate){
        this.translate = translate;
    }

    public String getTranslate(){
        return this.translate;
    }

}
