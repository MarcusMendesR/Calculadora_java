package Operacoes;

public class Divisao {
    private double num1;
    private double num2;

    public Divisao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double operacaoDivisao(double num1, double num2) {
       if(num2 <0){
        System.out.println("Não é possível dividir por zero.");
       }
       double resultado = num1 / num2;
       System.out.println(getNum1()+ " / " +getNum2()+ " = "+resultado);
       return resultado;
        
        
    }

}
