package Projeto;

public class Calculadora {
    // Atributos que armazenam os números e o operador escolhido
    double x;
    double y;
    String operador;

    // Construtor que inicializa os atributos da calculadora
    Calculadora(double xInicial, double yInicial, String operadorInicial) {
        x = xInicial;
        y = yInicial;
        operador = operadorInicial;
    }

    // Método que realiza o cálculo com base no operador fornecido
    public double calcular() {
        return switch (operador) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            case "x2" -> Math.pow(x, y);
            default -> 0;
        };
    }
}
