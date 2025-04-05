import java.util.InputMismatchException;
import java.util.Scanner;

import Operacoes.Adicao;
import Operacoes.Divisao;
import Operacoes.Multiplicacao;
import Operacoes.Subtracao;

public class Menu {
    private int num1;
    private int num2;

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

    Scanner scanner = new Scanner(System.in);

    public void menuOperacoes() {
        int opcao;
        do {
          try {
            System.out.println("--Calculadora Básica--");
            System.out.println("Digite o primeiro numero");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            num2 = scanner.nextInt();

            System.out.println("----Operações----");
            System.out.println("1- Adicao");
            System.out.println("2- Subtracao");
            System.out.println("3- Divisao");
            System.out.println("4- multiplicacao");
            System.out.println("0- sair");
            System.out.println("----------------------");

            
            
          } catch (InputMismatchException e) {
            System.out.println("Somente numeros sao aceitos.");
          }
           
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Adicao soma = new Adicao(num1, num2);
                    soma.operacaoAdicao(num1, num2);

                    break;
                case 2:
                    Subtracao subtrai = new Subtracao(num1, num2);
                    subtrai.opercaoSubtracao(num1, num2);

                    break;
                case 3:
                    Divisao divide = new Divisao(num1, num2);
                    divide.operacaoDivisao(num1, num2);
                    break;

                case 4:
                    Multiplicacao multiplica = new Multiplicacao(num1, num2);
                    multiplica.operacaoDivisao(num1, num2);
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
        System.out.println("Obrigado por usar a calculadora!");

    }
}
