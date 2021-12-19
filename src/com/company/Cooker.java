package com.company;

public class Cooker implements Forniture{

    private double price ;
    private String name ;

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    private double Power ;

    @Override
    public double getSpeacialParameter() {
        return Power;
    }
    @Override
    public void setSpeacialParameter(double power) {
        this.Power = power;
    }
    @Override
    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:" + getPrice() + " руб" +
                "  Склад: Location1"  + " Мощность:" + getSpeacialParameter() + " Вват");
    }
}
