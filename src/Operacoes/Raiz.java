package Operacoes;

public class Raiz {
    private double num;

    public Raiz(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double calculoRaiz(double num1) {
        if (num1 < 0) {
            System.out.println("Não existe raiz de numero negativo");
        }

        double resultado = Math.sqrt(num1);
        System.out.println("Raiz de " + getNum() + " = " + resultado);
        return resultado;

    }
}
