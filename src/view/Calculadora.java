package view;

import java.util.Scanner;

public class Calculadora {
    Scanner sc = new  Scanner(System.in);

    public Calculadora(){
        mostrarMenuCalculadora();
    }
    public void mostrarMenuCalculadora(){
        System.out.println("Bienvenido a la calculadora rapida\n");
        System.out.println("Que operacion desea realizar\n");
        System.out.println("1.- Suma\n");
        System.out.println("2.- Resta\n");
        System.out.println("3.- Multiplicacion\n");
        System.out.println("4.- Division\n");
        System.out.println("5.- Suma de Fraccion\n");
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                new SumaView();
                break;
            case 2:
                new RestaView();
                break;
            case 3:
                new MultiplicacionView();
                break;
            case 4:
                new DivicionView();
                break;
            case 5:
                new FraccionView();
                break;
        
            default:
                break;
        }

    }
}
