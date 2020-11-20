package com.dkit.emmanuelfrancis;

public class Laptop extends Computer{
    private String length;
    private String width;
    private double batteryLife;

    public Laptop(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, String length, String width, double batteryLife) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.length = length;
        this.width = width;
        this.batteryLife = batteryLife;
    }

    //Getter
    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    //Setter

    public void setLength(String length) {
        this.length = length;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", batteryLife=" + batteryLife +
                '}';
    }
}
