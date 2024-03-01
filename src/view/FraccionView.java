package view;

import java.util.Scanner;

import models.Fraccion;
import repository.ResultadosOperaciones;
import services.FraccionService;

public class FraccionView implements ResultadosOperaciones{
    Scanner sc = new  Scanner(System.in);
    FraccionService fraccionService = new FraccionService();
    public FraccionView(){
        mostrarResultado();
    }
    public void mostrarResultado(){
        System.out.println("Inserte el numerador de la primera fraccion\n");
        double numerador1 = sc.nextDouble();

        System.out.println("Inserte el denominador de la primera fraccion\n");
        double denominador1 = sc.nextDouble();

        System.out.println("Inserte el numerador de la segunda fraccion\n");
        double numerador2 = sc.nextDouble();

        System.out.println("Inserte el denominador de la segunda fraccion\n");
        double denominador2 = sc.nextDouble();

        Fraccion fraccionResult1 = new Fraccion(numerador1,denominador1);
        Fraccion fraccionResult2 = new Fraccion(numerador2,denominador2);
        Fraccion result = fraccionService.sumarFraccion(fraccionResult1,fraccionResult2);
        System.out.printf("El resultado de la fracción es:\n              %.2f%n", result.getNumber1());
        System.out.printf("            -------%n");
        System.out.printf("              %.2f%n", result.getNumber2());
        

    }
}
