import java.util.Scanner;

public class RelatorioLaboratorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de amostras:");
        int Amostras = sc.nextInt();

        System.out.println("Digite o tempo que levou a pesquisa, em minutos:");
        double TempoGasto = sc.nextDouble();

        System.out.println("Digite o número de resultados válidos:");
        int ResultadosValidos = sc.nextInt();

        double TempoMedio = (double) TempoGasto / Amostras;
        double PercentualValidos = (ResultadosValidos * 100.0) / Amostras;

        System.out.println("Total de amostras: " + Amostras);
        System.out.printf("Tempo médio gasto em cada amostra: %.2f minutos\n", TempoMedio);
        System.out.printf("Percentual válido de amostras: %.2f%%\n", PercentualValidos);

    }
}