package com.company;

public class ChairFornitureFactory implements FornitureFactory{
    @Override
    public Forniture createForniture() {
        return new Chair();
    }
}
