import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String []args ) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para começar a contagem regressiva: ");
        int contador = sc.nextInt();

        while (contador >= 0) {
            System.out.println(contador);
            contador = contador - 1; // (ou contador-- para diminuir e contador++ para somar)
        }
    }
}