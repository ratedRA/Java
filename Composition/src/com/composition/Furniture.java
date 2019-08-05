package com.composition;

public class Furniture {
    private int bed;
    private int table;
    private int cupboard;
    private Dimensions bdimensions;
    private Dimensions tdimensions;
    private Dimensions cdimensions;

    public Furniture(int bed, int table, int cupboard, Dimensions bdimensions, Dimensions tdimensions, Dimensions cdimensions) {
        this.bed = bed;
        this.table = table;
        this.cupboard = cupboard;
        this.bdimensions = bdimensions;
        this.tdimensions = tdimensions;
        this.cdimensions = cdimensions;
    }

    public int getBed() {
        return bed;
    }

    public int getTable() {
        return table;
    }
    public int getCupboard() {
        return cupboard;
    }

    public Dimensions getBdimensions() {
        return bdimensions;
    }

    public Dimensions getTdimensions() {
        return tdimensions;
    }
}
