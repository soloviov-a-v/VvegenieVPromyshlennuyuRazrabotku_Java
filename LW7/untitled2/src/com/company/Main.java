package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

	    FileReader fr = new FileReader("Сотрудники.txt");
        Scanner s = new Scanner(fr);

        ArrayList<Kadr> mas = new ArrayList<Kadr>();
	    while (s.hasNextLine())
	    {
	        String[] str = s.nextLine().split("\t");

	        if (str[0].equals("Диспетчер")){
	            mas.add(new Dispatcher(str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Boolean.parseBoolean(str[4]), str[5], Integer.parseInt(str[6]),Integer.parseInt(str[7])));
            }

            if (str[0].equals("ПассажирскийВодитель")){
                mas.add(new PassangerDriver(str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]), Integer.parseInt(str[4]), Boolean.parseBoolean(str[5]), Boolean.parseBoolean(str[6]), Boolean.parseBoolean(str[7]), Boolean.parseBoolean(str[8]), Boolean.parseBoolean(str[9])));
            }

            if (str[0].equals("ГрузовойВодитель")){
                mas.add(new LuggageDriver(str[1], Integer.parseInt(str[2]), Boolean.parseBoolean(str[3]), Integer.parseInt(str[4]), Boolean.parseBoolean(str[5]), Boolean.parseBoolean(str[6]), Boolean.parseBoolean(str[7]), Boolean.parseBoolean(str[8]), Boolean.parseBoolean(str[9])));
            }
            //System.out.print(str[0]);
        }
	    fr.close();

        mas.add(new Dispatcher("Евстигнеев И.С.", 1989, 3, true, "Железнодорожный", 9, 14));
        mas.add(new Dispatcher("Андреев А.Н.", 1995, 5, false, "Московсиий", 12, 19));
        mas.add(new Dispatcher("Орлов А.Н.", 1992, 2, false, "Советский", 21, 3));

        mas.add(new PassangerDriver("Андреев А.Н.", 1991, true, 3, true,
                false, false, true, true));
        mas.add(new PassangerDriver("Евстигнеев И.С.", 1994, false, 7, false,
                true, false, true, true));
        mas.add(new PassangerDriver("Синицын А.В.", 1981, true, 12, true,
                true, true, true, true));

        mas.add(new LuggageDriver("Синицын А.В.", 1991, true, 3, true,
                false, true, true, true));
        mas.add(new LuggageDriver("Евстигнеев И.С.", 1994, true, 7, false,
                true, false, true, true));
        mas.add(new LuggageDriver("Андреев А.Н.", 1992, true, 12, true,
                true, true, true, true));

        System.out.println("Профессия:");
        DynamicArray<String> prof = new DynamicArray<String>();
        for (int i=0; i<mas.size(); i++) prof.Add(mas.get(i).getProfession());
        System.out.println(prof.DifferentItemsWithCount());

        System.out.println("ФИО:");
        DynamicArray<String> fio = new DynamicArray<String>();
        for (int i=0; i<mas.size(); i++) fio.Add(mas.get(i).getFIO());
        System.out.println(fio.DifferentItemsWithCount());

        System.out.println("Пол:");
        DynamicArray<Boolean> gen = new DynamicArray<Boolean>();
        for (int i=0; i<mas.size(); i++) gen.Add(mas.get(i).getGen());
        System.out.println(gen.DifferentItemsWithCount());

        System.out.println("Год Рождения:");
        DynamicArray<Integer> by = new DynamicArray<Integer>();
        for (int i=0; i<mas.size(); i++) by.Add(mas.get(i).getBirthYear());
        System.out.println(by.DifferentItemsWithCount());

        System.out.println("Зарплата:");
        DynamicArray<Integer> zp = new DynamicArray<Integer>();
        for (int i=0; i<mas.size(); i++) zp.Add(mas.get(i).getZP());
        System.out.println(zp.DifferentItemsWithCount());
    }
}
