package com.dkit.emmanuelfrancis;

public class RaspberryPi extends Computer{
    private int gpioPinsNum;
    private String storageCapacity;

    //Constructors
    public RaspberryPi(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, int gpioPinsNum, String storageCapacity) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.gpioPinsNum = gpioPinsNum;
        this.storageCapacity = storageCapacity;
    }

    //Getters
    public int getGpioPinsNum() {
        return gpioPinsNum;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    //Setters
    public void setGpioPinsNum(int gpioPinsNum) {
        this.gpioPinsNum = gpioPinsNum;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    //toString
    @Override
    public String toString() {
        return "RaspberryPi{" +
                "gpioPinsNum=" + gpioPinsNum +
                ", storageCapacity='" + storageCapacity + '\'' +
                '}';
    }
}
