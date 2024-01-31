package com.example.bmwapp;

public class Car {
    private Integer year ;
    private String model;
    private String color;
    private Integer price;
    private Integer cylinder;
    private Integer horsepower;
    private Integer MN;
    private Double engineDisplacement;
    private String photo;

    public Car() {
    }

    public Car(Integer year, String model, String color, Integer price, Integer cylinder, Integer horsepower, Integer MN, Double engineDisplacement, String photo) {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getMN() {
        return MN;
    }

    public void setMN(Integer MN) {
        this.MN = MN;
    }

    public Double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", cylinder=" + cylinder +
                ", horsepower=" + horsepower +
                ", MN=" + MN +
                ", engineDisplacement=" + engineDisplacement +
                ", photo='" + photo + '\'' +
                '}';
    }
}
