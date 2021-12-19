package com.company;

public class Main {

    public static void main(String[] args) {
	FornitureFactory chairFornitureFactory1 = new ChairFornitureFactory();
    Forniture chair1 = chairFornitureFactory1.createForniture();
         chair1.setPrice(500);
         chair1.setName("Стул №1");
         chair1.setSpeacialParameter(40);
         chair1.getDescription();
     Forniture chair2 = chairFornitureFactory1.createForniture();
         chair1.setPrice(1900);
         chair1.setName("Стул №2");
         chair1.setSpeacialParameter(35);
         chair1.getDescription();
     FornitureFactory cookerFornitureFactory1 = new CookerFornitureFactory();
     Forniture cooker1 = cookerFornitureFactory1.createForniture();
        chair1.setPrice(1500);
        chair1.setName("Плита №1");
        chair1.setSpeacialParameter(1000);
        chair1.getDescription();
     Forniture cooker2 = cookerFornitureFactory1.createForniture();
        chair1.setPrice(1000);
        chair1.setName("Плита №2");
        chair1.setSpeacialParameter(800);
        chair1.getDescription();

    }
}
