package services;

import models.Multiplicacion;

public class MultiplicacionService {
    public Double multiplicar(Multiplicacion multiplicacion){
        Double result = .0;
        try{
            result = multiplicacion.getNumber1()*multiplicacion.getNumber2();
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }
}
