package com.company;

import java.time.LocalDateTime;

public abstract class Kadr implements IKadr
{
   protected String FIO;
   protected int BirthYear;
   protected boolean Gen;

   public void setFIO(String FIO) {this.FIO=FIO;}
   public void setBirthYear(int BirthYear) {
      int cy = LocalDateTime.now().getYear();
      if (BirthYear < cy - 65 || BirthYear > cy - 14) throw new IllegalArgumentException();
      this.BirthYear=BirthYear;
   }
   public void setGen(boolean Gen) {this.Gen=Gen;}

   public String getFIO() {return FIO;}
   public int getBirthYear() {return BirthYear;}
   public boolean getGen() {return Gen;}

}
