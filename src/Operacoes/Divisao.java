package Operacoes;

public class Divisao {
    private int num1;
    private int num2;

    public Divisao(int num1, int num2) {
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

    public void operacaoDivisao(int num1, int num2) {
        try {
            int resultado = num1 / num2;
            System.out.println(+getNum1()+ " / "+ getNum2()+ " = "+resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por 0.");
        }
        
    }

}
