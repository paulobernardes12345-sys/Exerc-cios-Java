import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 0;
        double subtotal;

        System.out.println("Lista de bebidas:\n");

        System.out.println("Coca-Cola");
        System.out.println("Red Bull");
        System.out.println("Água");
        System.out.println("Monster\n");

        System.out.print("Qual bebida deseja? ");
        String produto = sc.nextLine();

        if (produto.equalsIgnoreCase("Coca-Cola")) {

            preco = 7.99;
                
        }   else if (produto.equalsIgnoreCase("red bull")) {

            preco = 15.99;

        }   else if (produto.equalsIgnoreCase("Água")) {

            preco = 3.99;

        }   else if  (produto.equalsIgnoreCase("Monster")) {

            preco = 12.89;

        }   else    {

            System.out.println("Produto não encontrado.");
        }

        System.out.println("Quantas unidades você quer? ");
        int quantidade = sc.nextInt();
        subtotal = (quantidade * preco);

        System.out.println("O total da sua compra: " + subtotal);

        

    }
}