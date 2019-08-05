package com.encapsulation;

public class Printer {
    private int tonerLevel;
    private boolean isDuplex;
    private int noOfPagesPrinted = 0;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel>-1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }
    public int printPage(int pages){
        int pagesToPrint = pages;
        if(isDuplex()){
            pagesToPrint = pages/2;
        }

        System.out.println("Page is getting printed..");
        noOfPagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }
    public int addToner(int toner) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (tonerLevel + toner > 100) {
                return -1;
            } else {
                tonerLevel += toner;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }
}
