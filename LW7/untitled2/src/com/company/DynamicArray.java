package com.company;
import java.util.*;

public class DynamicArray<T>
{
    private ArrayList<T> array;

    public DynamicArray() {array = new ArrayList<T>();}

    public T GetItem(int index) { return array.get(index); }
    public void Add(T element) { array.add(element); }
    public void Clear() { array.clear(); }
    public void RemoveAt(int index) { array.remove(index); }

    public String DifferentItems()
    {
        String str = "";
        ArrayList<T> arr = new ArrayList<T>();
        for (int i=0; i<array.size(); i++) arr.add(array.get(i));

        for (int i=0; i<arr.size(); i++)
        {
            str += arr.get(i).toString() + "\n";
            for (int j=i; j<arr.size(); j++)
                if (arr.get(i).equals(arr.get(j)) || arr.get(i) == arr.get(j) || arr.get(i).toString().equals(arr.get(j).toString())) arr.remove(j);
        }
        return  str;
    }

    public int ItemCount(T item)
    {
        int count = 0;
        for (int i=0; i<array.size(); i++)
        {
            if (array.get(i).equals(item))count++;
        }
        return count;
    }

    public String DifferentItemsWithCount()
    {
        String str = "";
        ArrayList<T> arr = new ArrayList<T>();
        for (int i=0; i<array.size(); i++) arr.add(array.get(i));

        for (int i=0; i<arr.size(); i++)
        {
            str += arr.get(i).toString() + " - " + ItemCount(arr.get(i)) + "\n";
            for (int j=i+1; j<arr.size(); j=j)
            {
                if (arr.get(i).equals(arr.get(j)) || arr.get(i) == arr.get(j) || arr.get(i).toString().equals(arr.get(j).toString()))
                    arr.remove(j);
                else j++;
            }
        }
        return  str;
    }
}
