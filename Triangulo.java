import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) { 
    int base, altura, area;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da base:");
    base = scanner.nextInt();
    System.out.println("Digite o valor da altura:");
    altura = scanner.nextInt();

    area = base * altura / 2;

    System.out.println("O valor da area do triangulo e: " + area);

    }
}