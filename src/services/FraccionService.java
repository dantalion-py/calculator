package services;

import models.Fraccion;

public class FraccionService {
    public Fraccion sumarFraccion(Fraccion f1, Fraccion f2){
        Fraccion result = null;
        try{
            Double numerador = f1.getNumber1()+f2.getNumber2()+f1.getNumber2()+f2.getNumber1();
            Double denominador = f2.getNumber2()*f1.getNumber2();
            result = new Fraccion(numerador, denominador);
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
        
    }
}
