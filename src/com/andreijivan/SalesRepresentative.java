package com.andreijivan;

public class SalesRepresentative {
    private String name;
    private int quota;
    private int quotaValue;

    public SalesRepresentative(String name, int quota, int quotaValue) {
        this.name = name;
        this.quota = quota;
        this.quotaValue = quotaValue;
    }

    @Override
    public String toString() {
        return "SalesRepresentative " + name +", quota " + quota + ", quotaValue " + quotaValue;
    }

    public int totalSales(){
        return this.quota * this.quotaValue;
    }

}
