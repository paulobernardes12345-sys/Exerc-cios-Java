import java.util.Scanner;

public class aritimetica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double num1 = sc.nextDouble();

    System.out.println("Digite o segundo número: ");
    double num2 = sc.nextDouble();

    sc.nextLine();

    System.out.println("Você quer somar, subtrair, multiplicar ou dividir?");
    String operacao = sc.nextLine();

    if (operacao.equals("somar")) {
        System.out.println("O resultado é: " + (num1 + num2));

    }   
    
    else if (operacao.equals("subtrair")) {
        System.out.println("O resultado é: " + (num1 - num2));

    }

    else if (operacao.equals("multiplicar")) {
        System.out.println("O resultado é: " + (num1 * num2));
    }

    else if (operacao.equals("dividir")) {
        if (num2 != 0) {
            System.out.println("O resultado é: " + (num1 / num2));
        } else {
            System.out.println("Não é possível dividir por 0.");
        }       

    }

    }
}