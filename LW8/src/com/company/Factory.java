package com.company;

public class Factory {
    public IKadr getCurrentKadr(String input) {
        IKadr kadr = null;
        if (input.equals("Dispatcher") || input.equals("Диспетчер")) {
            kadr = new Dispatcher();
        } else if (input.equals("PassangerDriver") || input.equals("ПассажирскийВодитель")) {
            kadr = new PassangerDriver();
        } else if (input.equals("LuggageDriver") || input.equals("ГрузовойВодитель")) {
            kadr = new LuggageDriver();
        }
        return kadr;
    }
}
