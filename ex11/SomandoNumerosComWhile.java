import java.util.Scanner;
public class SomandoNumerosComWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

    while(contador < 5) { // se colocar "<= 5" ele vai repetir 6 vezes pq o while começa a contar em 0 (0 até 5 são 6 digitos!), então se quiser que peça 5 vezes, tem que colocar "< 5" pra ele parar no 4.

        System.out.println("Digite um número para somar: ");
        int numero = sc.nextInt();

        soma = soma + numero;

        contador++;
    }

        System.out.println("A soma de todos os números: " + soma);

    }
}