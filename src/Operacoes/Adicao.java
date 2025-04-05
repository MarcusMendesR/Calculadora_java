package Operacoes;

public class Adicao {
    private int num1;
    private int num2;

    public Adicao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void operacaoAdicao(int num1, int num2) {

        int resultado = num1 + num2;
        System.out.println(getNum1()+ " + "+getNum2()+ " = "+resultado);
    }

}
