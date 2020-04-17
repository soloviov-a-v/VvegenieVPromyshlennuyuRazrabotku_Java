package com.company;

public class LuggageDriver extends Driver implements InformationMethods{
    protected boolean AllowedToTransferExpensive;
    protected boolean AllowedToTransferMore3Tonn;
    protected boolean ECategory;

    public void setAllowedToTransferExpensive(boolean AllowedToTransferExpensive) {this.AllowedToTransferExpensive=AllowedToTransferExpensive;}
    public void setAllowedToTransferMore3Tonn(boolean AllowedToTransferMore3Tonn) {this.AllowedToTransferMore3Tonn=AllowedToTransferMore3Tonn;}
    public void setEcategory(boolean ECategory) {this.ECategory=ECategory;}

    public boolean getAllowedToTransferExpensive() {return AllowedToTransferExpensive;}
    public boolean getAllowedToTransferMore3Tonn() {return AllowedToTransferMore3Tonn;}
    public boolean getEcategory() {return ECategory;}
    public String getProfession() {return "LuggageDriver";}
    public int getZP() {return 10000 + Staj * 2500;}

    public String toString() {
        String str = "";
        str += "Водитель грузовой машины " + FIO + " " + BirthYear + " года рождения ";
        if (Gen) str += "юноша ";
        else str += "дквушка ";
        if (PersCar) str += "имеет ЛА ";
        else str += "не имеет ЛА ";
        str += "работает уже " + Staj + " лет. ";
        str += "Разрешения: ";
        if (AllowedToLeaveCity) str += "межгород; ";
        if (AllowedToTransferExpensive) str += "перевоз ценностей; ";
        if (AllowedToTransferMore3Tonn) str += "перевоз более 3 тонн; ";
        if (ECategory) str += "езда с полуприцепом; ";

        return str;
    }

    public String toString2() {
         return "ГрузовойВодитель" + "\t" + FIO + "\t" + BirthYear + "\t" + Gen + "\t" + Staj + "\t" + PersCar +
                "\t" + AllowedToLeaveCity + "\t" +AllowedToTransferExpensive + "\t" + AllowedToTransferMore3Tonn + "\t" + ECategory;
    }

    public LuggageDriver(String fio, int BirthYear, boolean Gen, int Staj, boolean PersCar,
                           boolean AllowedToLeaveCity,  boolean AllowedToTransferExpensive, boolean AllowedToTransferMore3Tonn, boolean ECategory){
        this.FIO = fio; this.BirthYear = BirthYear; this.Gen = Gen; this.Staj = Staj; this.AllowedToLeaveCity = AllowedToLeaveCity;
        this.AllowedToTransferExpensive = AllowedToTransferExpensive; this.AllowedToTransferMore3Tonn = AllowedToTransferMore3Tonn; this.ECategory = ECategory;
    }
}

