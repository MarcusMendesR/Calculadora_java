package Operacoes;

public class Multiplicacao {

    private double num1;
    private double num2;

    public Multiplicacao(double num12, double num22) {
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

    public void operacaoDivisao(int num1, int num2){
        
        int resultado = num1 * num2;
        System.out.println(getNum1()+ " x " +getNum2()+ " = "+resultado);
    }

    public double operacaoMultiplicacao(double num12, double num22) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'operacaoMultiplicacao'");
    }
}
