
import javax.swing.*;

import Operacoes.Adicao;
import Operacoes.Divisao;
import Operacoes.Multiplicacao;
import Operacoes.Potenciacao;
import Operacoes.Raiz;
import Operacoes.Subtracao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField campoNum1, campoNum2, CampoResultado;
    private JButton btnAdicao, btnSubtracao, btnDivisao, btnMultiplicacao, btnPotenciacao, btnRaiz;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 4, 10,10));
        campoNum1 = new JTextField(10);
        campoNum2 = new JTextField(10);
        CampoResultado = new JTextField(10);
        CampoResultado.setEditable(false);

        btnAdicao = new JButton("+");
        btnSubtracao = new JButton("-");
        btnDivisao = new JButton("/");
        btnMultiplicacao = new JButton("*");
        btnPotenciacao = new JButton("^");
        btnRaiz = new JButton("√");

        add(new JLabel("Numero 1:"));
        add(campoNum1);
        add(new JLabel("Numero 2:"));
        add(campoNum2);
        add(btnAdicao);
        add(btnSubtracao);
        add(btnDivisao);
        add(btnMultiplicacao);
        add(btnPotenciacao);
        add(btnRaiz);
        add(new JLabel("Resultado:"));
        add(CampoResultado);

        btnAdicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('+');
            }
        });
        btnSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('-');
            }
        });
        btnDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('/');
            }
        });
        btnMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('*');
            }
        });
        btnPotenciacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('^');
            }
        });
        btnRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('√');
            }
        });
    }

    private void calcular(char operador) {
        try {
            double num1 = Double.parseDouble(campoNum1.getText());
            double num2 = Double.parseDouble(campoNum2.getText());
            double resultado = 0;

            switch (operador) {
                case '+':
                    Adicao adicao = new Adicao(num1, num2);
                   resultado = adicao.operacaoAdicao(num1, num2);
                    break;
                case '-':
                    Subtracao subtracao = new Subtracao(num1, num2);
                   resultado = subtracao.opercaoSubtracao(num1, num2);
                    break;
                case '/':
                    Divisao divisao = new Divisao(num1, num2);
                   resultado = divisao.operacaoDivisao(num1, num2);
                    break;
                case '*':
                    Multiplicacao multiplicacao = new Multiplicacao(num1, num2);
                   resultado = multiplicacao.operacaoMultiplicacao(num1, num2);
                    break;
                case '^':
                    Potenciacao potenciacao = new Potenciacao(num1, num2);
                   resultado = potenciacao.calculoPotencia(num1, num2);
                    break;
                case '√':
                    Raiz raiz = new Raiz(num1);
                   resultado = raiz.calculoRaiz(num1);
                    break;
                default:
                    break;
            }
            CampoResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            CampoResultado.setText("Erro: Insira valores válidos.");
        }
    }

    public static void main(String[] args) {
        CalculadoraGUI calculadora = new CalculadoraGUI();
        calculadora.setVisible(true);
    }
}