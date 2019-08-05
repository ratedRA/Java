package com.encapsulation;

public class MainPrinter {
    public static void main(String []args){
        Printer printer = new Printer(35, true);
        System.out.println("if the printer is duplex: "+printer.isDuplex());
        int noOfPages = printer.printPage(20);
        System.out.println("No of printed pages: "+noOfPages);
        printer.addToner(20);
        System.out.println("Toner level "+printer.getTonerLevel());
    }
}
