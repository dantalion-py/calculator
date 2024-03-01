package services;

import models.Resta;

public class RestaService {
    public Double restar(Resta resta){
        Double result = .0;
        try{
            result = resta.getNumber1()-resta.getNumber2();
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }
}
