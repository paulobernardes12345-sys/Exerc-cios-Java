import java.util.Scanner;

public class RepetirSenha {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

    System.out.println("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

    int senhaCorreta = 2469;

    while(senhaDigitada != senhaCorreta) {

        System.out.println("Senha incorreta!");
        System.out.println("Tente novamente: ");
        senhaDigitada = sc.nextInt();
       }
        
        System.out.println("Login realizado com sucesso!");
    }
}