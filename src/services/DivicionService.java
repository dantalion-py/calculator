package services;

import models.Divicion;

public class DivicionService {


    public Double dividir(Divicion divicion){
        double result = 0.0;
        try{
            result = divicion.getNumber1()/divicion.getNumber2();
            return result;
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }
    
}
