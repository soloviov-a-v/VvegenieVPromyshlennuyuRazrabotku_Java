package com.company;

public class PassangerDriver extends Driver implements InformationMethods{
    protected boolean VIP;
    protected boolean AllowedToTransferChlidren;
    protected boolean AllowedToTransMore8People;

    public void setVIP(boolean VIP) {this.VIP=VIP;}
    public void setAllowedToTransferChlidren(boolean AllowedToTransferChlidren) {this.AllowedToTransferChlidren=AllowedToTransferChlidren;}
    public void setAllowedToTransMore8People(boolean AllowedToTransMore8People) {this.AllowedToTransMore8People=AllowedToTransMore8People;}

    public boolean getVIP() {return VIP;}
    public boolean getAllowedToTransferChlidren() {return AllowedToTransferChlidren;}
    public boolean getAllowedToTransMore8People() {return AllowedToTransMore8People;}
    public String getProfession() {return "PassangerDriver";}
    public int getZP() {return 15000 + Staj * 1500;}

    public String toString(){
        String str = "";
        str += "Водитель легковой машины " + FIO +" "+BirthYear + " года рождения ";
        if (Gen) str += "юноша "; else str+="дквушка ";
        if (PersCar) str += "имеет ЛА "; else str+="не имеет ЛА ";
        str += " работает уже " + Staj +" лет. ";
        str += "Разрешения: ";
        if (AllowedToLeaveCity) str += "межгород; ";
        if (VIP) str += "перевоз VIP; ";
        if (AllowedToTransferChlidren) str += "перевоз детей; ";
        if (AllowedToTransMore8People) str += "перевоз более 8 человек; ";

        return str;
    }

    public String toString2() {
        return "ПассажирскийВодитель" + "\t" + FIO + "\t" + BirthYear + "\t" + Gen + "\t" + Staj + "\t" + PersCar +
                "\t" + AllowedToLeaveCity + "\t" + VIP + "\t" + AllowedToTransferChlidren + "\t" + AllowedToTransMore8People;
    }

    public PassangerDriver(String fio, int BirthYear, boolean Gen, int Staj, boolean PersCar,
                           boolean AllowedToLeaveCity,  boolean VIP, boolean AllowedToTransferChlidren, boolean AllowedToTransMore8People){
        this.FIO = fio; this.BirthYear = BirthYear; this.Gen = Gen; this.Staj = Staj; this.AllowedToLeaveCity = AllowedToLeaveCity;
        this.VIP = VIP; this.AllowedToTransferChlidren = AllowedToTransferChlidren; this.AllowedToTransMore8People = AllowedToTransMore8People;
    }
}
