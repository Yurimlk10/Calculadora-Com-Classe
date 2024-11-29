package Projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um scanner para o escolhas dos valores
        Scanner scanner = new Scanner(System.in);

        // Solicitando o primeiro valor
        System.out.println("=================================");
        System.out.print("Digite o x: ");
        double x = scanner.nextDouble();

        // Solicitando o segundo valor
        System.out.print("Digite o y: ");
        double y = scanner.nextDouble();

        // Solicitando o operador
        System.out.println("=================================");
        System.out.println("[+]: Adição \n[-]: Subtração \n[*]: Multiplicação \n[/]: Divisão \n[x2]: Exponenciação");
        System.out.print("Escolha uma opção: ");
        String operador = scanner.next();
        System.out.println("=================================");

        // Criando um objeto da classe Calculadora com os valores e operador fornecidos
        Calculadora calculadora = new Calculadora(x, y, operador);

        // Chamando o método calcular para realizar a operação e armazenando o resultado
        double resultado = calculadora.calcular();

        // Verificando se o operador foi válido e exibindo o resultado
        if (resultado != 0) {
            System.out.println("RESULTADO");
            System.out.printf("%.2f %s %.2f = %.2f", x, operador, y, resultado);
            System.out.println("\n=================================");
        } else {
            System.out.println("Operador inválido.");
        }
        // Fechando o scaanner
        scanner.close();
    }
}
