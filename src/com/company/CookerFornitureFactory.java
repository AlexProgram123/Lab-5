package com.company;

public class CookerFornitureFactory implements FornitureFactory{
    @Override
    public Forniture createForniture() {
        return new Cooker();
    }
}
