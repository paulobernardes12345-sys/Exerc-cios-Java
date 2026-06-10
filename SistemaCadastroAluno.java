import java.util.Scanner;

public class SistemaCadastroAluno {
    public static void main(String []args) {
    Scanner sc = new Scanner(System.in);

    String[] nomes = new String[10];
    double[] notas = new double[10];

    int QuantidadeAlunos = 0;
    int opcao = 0;

while (opcao != 4) {
    
    System.out.println("Menu de acesso curricular estudantil");
    System.out.println("1 - Cadastrar aluno.");
    System.out.println("2 - Buscar aluno.");
    System.out.println("3 - Mostrar todos.");
    System.out.println("4 - Sair.");

    opcao = sc.nextInt();
    sc.nextLine();
    
     switch(opcao) {

        case 1:
            
            String resposta = "s";
            while(resposta.equals("s")) {

            System.out.println("Digite o nome do aluno a ser cadastrado:");
            String nome = sc.nextLine();

            System.out.println("Digite a nota do aluno(a):");
            double nota = sc.nextDouble();
            sc.nextLine();

            nomes[QuantidadeAlunos] = nome;
            notas[QuantidadeAlunos] = nota;

            QuantidadeAlunos++;

            System.out.println("Cadastro realizado, deseja cadastrar outro aluno? (s/n)");
            resposta = sc.nextLine();

            while(!resposta.equals("s") && (!resposta.equals("n"))) {
                System.out.println("Opção inválida!");
                resposta = sc.nextLine();
            }
        }
        break;

        case 2:
            System.out.println("Digite o nome do aluno que deseja buscar: ");
            String NomeBuscado = sc.nextLine();

            for(int i = 0; i < QuantidadeAlunos; i++)

            if(nomes[i].equals(NomeBuscado)) {
            System.out.println("Aluno: " + nomes[i] + " Nota: " + notas[i]);
            System.out.println("");
            }
        break;

        case 3:
            if (QuantidadeAlunos == 0) {
                System.out.println("Nenhum aluno cadastrado!");
                System.out.println(""); // espaço pra ficar mais legível
            }
            else {
            for(int i = 0; i < QuantidadeAlunos; i++)
            System.out.println(nomes[i] + " - " + notas[i]);
            System.out.println(""); // espaço pra ficar mais legível
            }

        break;

        case 4:
            System.out.println("Saindo...");
        break;

        default:
            System.out.println("Opção inválida!");
            System.out.println(""); // espaço pra ficar mais legível
        }
    }

    }
}