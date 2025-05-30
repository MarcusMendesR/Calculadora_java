package Operacoes;

public class Potenciacao {
    private double num1;
    private double num2;

    public Potenciacao(double num1, double num2) {
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

    public double calculoPotencia(double num1,double num2){
        double resultado;
        resultado = Math.pow(num1, num2);
        System.out.println(getNum1()+ " ^ "+getNum2()+ " = "+resultado);
        return resultado;
    }

}
