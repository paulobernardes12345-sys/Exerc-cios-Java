import java.util.Scanner;

public class calculomedias {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    String NomeAluno = sc.nextLine();

    System.out.println("Digite a nota do primeiro semestre: ");
    double Nota1 = sc.nextDouble();

    System.out.println("Digite a nota do segundo semestre: ");
    double Nota2 = sc.nextDouble();

    System.out.println("Digite a nota do terceiro semestre: ");
    double Nota3 = sc.nextDouble();

    System.out.println("Digite a nota do quarto semestre: ");
    double Nota4 = sc.nextDouble();

    sc.nextLine();

    double media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

    if (media <6.9) {

        System.out.println(NomeAluno + " Está reprovado com média " + media);
    }

    else {

        System.out.println(NomeAluno + " Está aprovado com média: " + media);
    }

    }
}