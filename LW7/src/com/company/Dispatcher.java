package com.company;

public class Dispatcher extends Kadr implements InformationMethods{
    protected String Rayon;
    protected int WorksFrom;
    protected int Staj;
    protected int WorksUpto;

    public void setRayon(String Rayon) {this.Rayon=Rayon;}
    public void setWorksFrom(int WorksFrom) {
        if (WorksFrom < 0 || WorksFrom > 23) throw new IllegalArgumentException();
        this.WorksFrom=WorksFrom;
    }
    public void setWorksUpto(int WorksUpto) {
        if (WorksUpto < 0 || WorksUpto > 23 || WorksUpto > WorksFrom) throw new IllegalArgumentException();
        this.WorksUpto=WorksUpto;
    }
    public void setStaj(int Staj) {this.Staj = Staj;}

    public String getRayon() {return Rayon;}
    public int getWorksFrom() {return WorksFrom;}
    public int getWorksUpto() {return WorksUpto;}
    public int getStaj() {return Staj;}

    public String getProfession() {return "Dispatcher";}
    public int getZP() {return 10000 + Staj * 2000;}

    public Dispatcher(String fio, int BirthYear, int Staj, boolean Gen, String Rayon, int WorksFrom, int WorksUpto){
        this.FIO = fio;
        this.BirthYear = BirthYear;
        this.Staj = Staj;
        this.Gen = Gen;
        this.Rayon = Rayon;
        this.WorksFrom = WorksFrom;
        this.WorksUpto = WorksUpto;
    }

    public  String toString(){
        String str = "";
        str += "Диспетчер такси " + FIO +" "+BirthYear + " года рождения ";
        if (Gen) str += "юноша "; else str+="дeвушка ";
        str += "работает в районе "+Rayon+" c "+WorksFrom +" по "+WorksUpto;
        return str;
    }

    public String toString2() {
        return "Диспетчер" + "\t" + FIO + "\t" + BirthYear + "\t" + Staj + "\t" + Gen +
                "\t" + Rayon + "\t" + WorksFrom + "\t" + WorksUpto;
    }
}
