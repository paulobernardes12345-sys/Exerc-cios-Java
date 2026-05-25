import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em celcius: ");
    double TemperaturaC = sc.nextDouble();
    double F = (TemperaturaC * 1.8) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + F);


    }
}