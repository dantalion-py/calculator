package view;

import java.util.Scanner;

import models.Multiplicacion;
import repository.ResultadosOperaciones;
import services.MultiplicacionService;

public class MultiplicacionView implements ResultadosOperaciones{
    Scanner sc = new  Scanner(System.in);
    MultiplicacionService multiplicacionService = new MultiplicacionService();
    public MultiplicacionView(){
        mostrarResultado();
    }
    public void mostrarResultado(){
        System.out.println("Inserte el multiplicando\n");
        double multiplicando = sc.nextDouble();

        System.out.println("Inserte el multiplicador\n");
        double multiplicador = sc.nextDouble();

        Multiplicacion mutiplicacionResult = new Multiplicacion(multiplicando,multiplicador);
        double result = multiplicacionService.multiplicar(mutiplicacionResult);
        System.out.println("el resultado es " + result);


    }
}
