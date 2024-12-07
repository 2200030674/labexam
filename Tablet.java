package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
public class Tablet extends Device {
    private double screenSize;
    private int batteryLife;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
