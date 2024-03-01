package view;

import java.util.Scanner;

import models.Resta;
import repository.ResultadosOperaciones;
import services.RestaService;

public class RestaView implements ResultadosOperaciones{
    Scanner sc = new  Scanner(System.in);
    RestaService restaService = new RestaService();
    public RestaView(){
        mostrarResultado();
    }
    public void mostrarResultado(){
        System.out.println("Inserte el minuendo\n");
        double minuendo = sc.nextDouble();

        System.out.println("Inserte el diferencia\n");
        double diferencia = sc.nextDouble();

        Resta restaResult = new Resta(minuendo,diferencia);
        double result = restaService.restar(restaResult);
        System.out.println("el resultado es " + result);


    }
}
