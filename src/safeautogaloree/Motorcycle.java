/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeautogaloree;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Brooke Baldwin
 */
public class Motorcycle implements Serializable{
    private String name;
    private String category;
    private String brand;
    private String engineCapacity;
    private int manufacturedDate;
    private double price;

    public Motorcycle(String name, String category, String brand, String engineCapacity, int manufacturedDate, double price) {
        this.category = category;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.manufacturedDate = manufacturedDate;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(int manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
