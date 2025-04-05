package Operacoes;

public class Subtracao {

    private double num1;
    private double num2;

    public Subtracao(double num12, double num22) {
        this.num1 = num12;
        this.num2 = num22;
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

    public double opercaoSubtracao(double num12, double num22){

        double resultado = num12 - num22;
        System.out.println(getNum1()+" - "+getNum2()+ " = "+resultado);
        return resultado;
    }

}
