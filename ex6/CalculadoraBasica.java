import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    int opcao;
    double num1, num2;

    System.out.println("~~~~~~~CALCULADORA~~~~~~~");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    System.out.println("Escolha uma opção: ");
    opcao = sc.nextInt();
    System.out.println("Digite o primeiro número: ");
    num1 = sc.nextDouble();
    System.out.println("Digite o segundo número: ");
    num2 = sc.nextDouble();

    switch (opcao) {

        case 1:
            System.out.println("Resultado: " + (num1 + num2));
            break;
            
        case 2:
            System.out.println("Resultado: " + (num1 - num2));
            break;

        case 3:
            System.out.println("Resultado: " + (num1 * num2));
            break;

        case 4:
            
            if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
             
            }   else  {
                System.out.println("Impossível dividir por 0!");
            } break;

    default:
            System.out.println("Opção invalida!");
            
         }

    }
}