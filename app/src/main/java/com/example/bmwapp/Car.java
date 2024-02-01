package com.example.bmwapp;

public class Car {
    private String year ;
    private String model;
    private String color;
    private String price;
    private String cylinder;
    private String horsepower;
    private String MN;
    private String engineDisplacement;
    private String photo;

    public Car() {
    }

    public Car(String year, String model, String color, String price, String cylinder, String horsepower, String MN, String engineDisplacement, String photo) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.price = price;
        this.cylinder = cylinder;
        this.horsepower = horsepower;
        this.MN = MN;
        this.engineDisplacement = engineDisplacement;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year='" + year + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", cylinder='" + cylinder + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", MN='" + MN + '\'' +
                ", engineDisplacement='" + engineDisplacement + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getMN() {
        return MN;
    }

    public void setMN(String MN) {
        this.MN = MN;
    }

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(String engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
