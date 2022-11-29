package objects.enums;

public enum TypeOfService {
    STATE("государственная"),
    MILITARY("военная"),
    POLICE("правоохранительная"),
    CHURCH("церковная"),
    UNDEFINED("неопределённая");

    private String translate;

    TypeOfService(String translate){
        this.translate = translate;
    }

    public String getTranslate(){
        return this.translate;
    }
}
