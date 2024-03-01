package view;

import java.util.Scanner;

import models.Divicion;
import repository.ResultadosOperaciones;
import services.DivicionService;

public class DivicionView implements ResultadosOperaciones{
    Scanner sc = new  Scanner(System.in);
    DivicionService divicionService = new DivicionService();
    public DivicionView(){
        mostrarResultado();
    }
    public void mostrarResultado(){
        System.out.println("Inserte el dividendo\n");
        double dividendo = sc.nextDouble();

        System.out.println("Inserte el divisor\n");
        double divisor = sc.nextDouble();

        Divicion divicionResult = new Divicion(dividendo,divisor);
        double result = divicionService.dividir(divicionResult);
        System.out.println("el resultado es " + result);


    }
}
