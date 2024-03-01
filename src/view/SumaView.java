package view;

import java.util.Scanner;

import models.Suma;
import repository.ResultadosOperaciones;
import services.SumaService;

public class SumaView implements ResultadosOperaciones{
    Scanner sc = new  Scanner(System.in);
    SumaService sumaService = new SumaService();
    public SumaView(){
        mostrarResultado();
    }
    public void mostrarResultado(){
        System.out.println("Inserte el sumando1\n");
        double sumando1 = sc.nextDouble();

        System.out.println("Inserte el sumando2\n");
        double sumando2 = sc.nextDouble();

        Suma sumaResult = new Suma(sumando1,sumando2);
        double result = sumaService.sumar(sumaResult);
        System.out.println("el resultado es " + result);


    }
}
