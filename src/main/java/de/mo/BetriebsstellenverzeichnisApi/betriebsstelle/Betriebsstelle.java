package de.mo.BahnstellenverzeichnisApi.bahnstelle;

public class Betriebsstelle {
    private String plc;
    private String rl100Code;
    private String rl100Long;
    private String rl100Short;
    private String typeShort;
    private String typeLong;
    private String operatingCondition;
    private String dateFrom;
    private String dateTo;
    private String branch;
    private String region;
    private String lastChange;



    public Betriebsstelle(){
        super();
    }

    public Betriebsstelle(String plc, String rl100Code, String rl100Long, String rl100Short, String typeShort, String typeLong, String operatingCondition, String dateFrom, String dateTo, String branch, String region, String lastChange) {
        this.plc = plc;
        this.rl100Code = rl100Code;
        this.rl100Long = rl100Long;
        this.rl100Short = rl100Short;
        this.typeShort = typeShort;
        this.typeLong = typeLong;
        this.operatingCondition = operatingCondition;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.branch = branch;
        this.region = region;
        this.lastChange = lastChange;
    }



    public String getPlc() {
        return plc;
    }

    public String getRl100Code() {
        return rl100Code;
    }

    public String getRl100Long() {
        return rl100Long;
    }

    public String getRl100Short() {
        return rl100Short;
    }

    public String getTypeShort() {
        return typeShort;
    }

    public String getTypeLong() {
        return typeLong;
    }

    public String getOperatingCondition() {
        return operatingCondition;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public String getBranch() {
        return branch;
    }

    public String getRegion() {
        return region;
    }

    public String getLastChange() {
        return lastChange;
    }



    @Override
    public String toString() {
        return "{" +
                "plc='" + plc + '\'' +
                ", rl100Code='" + rl100Code + '\'' +
                ", rl100Long='" + rl100Long + '\'' +
                ", rl100Short='" + rl100Short + '\'' +
                ", typeShort='" + typeShort + '\'' +
                ", typeLong='" + typeLong + '\'' +
                ", operatingCondition='" + operatingCondition + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", branch='" + branch + '\'' +
                ", region='" + region + '\'' +
                ", lastChange='" + lastChange + '\'' +
                '}';
    }
}