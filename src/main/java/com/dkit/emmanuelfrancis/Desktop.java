package com.dkit.emmanuelfrancis;

public class Desktop extends Computer{
    private String monitor;

    public Desktop(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, String monitor) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.monitor = monitor;
    }

    //Getters

    public String getMonitor() {
        return monitor;
    }

    //Setters

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "monitor='" + monitor + '\'' +
                '}';
    }
}
