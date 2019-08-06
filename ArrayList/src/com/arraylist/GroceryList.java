package com.arraylist;
import java.util.ArrayList;

public class GroceryList {
    private int[] myNumber = new int[10];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printArray(){
        System.out.println("you have "+groceryList.size()+" items in your list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println(i+1+". "+groceryList.get(i));
        }
    }
    public void addGroceryItem(String itemName){
        groceryList.add(itemName);
    }
    public void modifyGroceryItem(int position, String itemName){
        groceryList.set(position, itemName);
        System.out.println("item at "+position+1+" has been modified");
    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String itemName){
        //boolean exists = groceryList.contains(itemName);
        int index = groceryList.indexOf(itemName);
        if(index>=0){
            return groceryList.get(index);
        }
        return null;
    }
}
