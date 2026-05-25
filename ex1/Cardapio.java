import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Insira seu nome para fazer o pedido!");
            String nome = sc.nextLine();
            System.out.println("Olá, " + nome + " seja bem-vindo, oque deseja?");

            System.out.println("1 - Hamburguer");
            System.out.println("2 - Pizza");
            System.out.println("3 - Cachorro Quente");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                        System.out.println("O Hamburguer custará 19,90$");
                        break;
                case 2:
                        System.out.println("A Pizza custará 50,00$");
                        break;
                case 3:
                        System.out.println("O Cachorro quente custará 29,90$");
                        break;                
            }
        sc.close();



    }
}