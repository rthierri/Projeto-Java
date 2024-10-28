import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;

        // Loop até o usuário digitar "."
        while (true) {
            System.out.print("Digite o operador (+, -, /, *) ou '.' para sair: ");
            operador = scanner.next();

            if (operador.equals(".")) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            // Cria um objeto Calculadora com os números fornecidos
            Calculadora calc = new Calculadora(num1, num2);

            // Executa a operação com base no operador fornecido
            int resultado;
            switch (operador) {
                case "+":
                    resultado = calc.some();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = calc.subtraia();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    resultado = calc.divida();
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = calc.multiplique();
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido!");
            }
        }

        scanner.close();
    }
}