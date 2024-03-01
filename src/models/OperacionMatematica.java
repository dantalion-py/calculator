package models;

public class OperacionMatematica {
    private Double number1;
    private Double number2;
    public OperacionMatematica(Double number1, Double number2){
        this.number1 = number1;
        this.number2 = number2;
    }


    public Double getNumber1(){
        return this.number1;
    }

    public Double getNumber2(){
        return this.number2;
    }

}
