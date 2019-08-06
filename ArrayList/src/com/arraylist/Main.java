package com.arraylist;

import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        boolean quit = false;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice in range(1-6)");
            int choice = sc.nextInt();
            sc.nextLine(); //to clear the input buffer.
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printItems();
                    break;
                case 2:
                    addItems();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForitem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("0 - To see all available options");
        System.out.println("1 - To see all grocery items");
        System.out.println("2 - To add items");
        System.out.println("3 - To modify item");
        System.out.println("4 - To remove item.");
        System.out.println("5 - To find an item");
        System.out.println("6 - To quit");
    }
    public static void printItems(){
        groceryList.printArray();
    }
    public static void addItems(){
        System.out.println("enter the item you want to add");
        String itemName = sc.nextLine();
        groceryList.addGroceryItem(itemName);
    }
    public static void modifyItem(){
        System.out.println("enter the item no");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.println("enter item name");
        String name = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,name);
    }
    public static void searchForitem(){
        String name = sc.nextLine();
        String res = groceryList.findItem(name);
        if(res!=null){
            System.out.println("Item is present in the grocery list");
        }
        else{
            System.out.println("Item is not present in the grocery list");
        }
    }
    public static void removeItem(){
        System.out.println("enter item number");
        int itemNo = sc.nextInt();
        groceryList.removeGroceryItem(itemNo-1);
    }
    public static void seeOptions(){
        System.out.println("0,1,2,3,4,5,6");
    }
}
