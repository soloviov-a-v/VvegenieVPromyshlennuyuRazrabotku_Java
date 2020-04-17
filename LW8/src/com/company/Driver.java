package com.company;

public abstract class Driver extends Kadr implements IKadr{
    protected int Staj;
    protected boolean PersCar;
    protected boolean AllowedToLeaveCity;

    public void setStaj(int Staj) {
        if (Staj < 0) throw new IllegalArgumentException();
        this.Staj=Staj;
    }
    public void setPersCar(boolean PersCar) {this.PersCar=PersCar;}
    public void setAllowedToLeaveCity(boolean AllowedToLeaveCity) {this.AllowedToLeaveCity=AllowedToLeaveCity;}

    public int getStaj() {return Staj;}
    public boolean getPersCar() {return PersCar;}
    public boolean getAllowedToLeaveCity() {return AllowedToLeaveCity;}


}
