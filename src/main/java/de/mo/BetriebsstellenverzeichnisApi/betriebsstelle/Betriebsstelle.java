package de.mo.BetriebsstellenverzeichnisApi.betriebsstelle;

public class Betriebsstelle {
    private String plc;
    private String rl100Code;
    private String rl100Langname;
    private String rl100Kurzname;
    private String typKurz;
    private String typLang;
    private String betriebszustand;
    private String datumAb;
    private String datumBis;
    private String niederlassung;
    private String regionalbereich;
    private String letzteAenderung;



    public Betriebsstelle(){}

    public Betriebsstelle(String plc, String rl100Code, String rl100Langname, String rl100Kurzname, String typKurz, String typLang, String betriebszustand, String datumAb, String datumBis, String niederlassung, String regionalbereich, String letzteAenderung) {
        this.plc = plc;
        this.rl100Code = rl100Code;
        this.rl100Langname = rl100Langname;
        this.rl100Kurzname = rl100Kurzname;
        this.typKurz = typKurz;
        this.typLang = typLang;
        this.betriebszustand = betriebszustand;
        this.datumAb = datumAb;
        this.datumBis = datumBis;
        this.niederlassung = niederlassung;
        this.regionalbereich = regionalbereich;
        this.letzteAenderung = letzteAenderung;
    }

    public String getPlc() {
        return plc;
    }

    public String getRl100Code() {
        return rl100Code;
    }

    public String getRl100Langname() {
        return rl100Langname;
    }

    public String getRl100Kurzname() {
        return rl100Kurzname;
    }

    public String getTypKurz() {
        return typKurz;
    }

    public String getTypLang() {
        return typLang;
    }

    public String getBetriebszustand() {
        return betriebszustand;
    }

    public String getDatumAb() {
        return datumAb;
    }

    public String getDatumBis() {
        return datumBis;
    }

    public String getNiederlassung() {
        return niederlassung;
    }

    public String getRegionalbereich() {
        return regionalbereich;
    }

    public String getLetzteAenderung() {
        return letzteAenderung;
    }
}
