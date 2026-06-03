import java.util.Scanner;

public class TreinoBoolean {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o produto que você quer buscar: teclado, mouse, tela, gabinete.");
    String escolha = sc.nextLine();
    String[] itens = {"teclado", "mouse", "tela", "gabinete"};

    boolean encontrado = false;

    for(int i = 0; i < itens.length; i++) {
        if(itens[i].equals(escolha)) {
            encontrado = true;
        }
    }
    if(encontrado) {
        System.out.println("Produto encontrado!");
    }   else {
        System.out.println("Produto não encontrado! :(");
    }

    }
}