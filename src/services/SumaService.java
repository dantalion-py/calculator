package services;

import models.Suma;

public class SumaService {
    public Double sumar(Suma suma){
        Double result = .0;
        try{
            result = suma.getNumber1()+suma.getNumber2();
        }catch(Exception e){
            System.out.println(e);
        }
        return result;

    }
}
