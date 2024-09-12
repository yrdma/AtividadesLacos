import java.util.Random;
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroEscolhido = 101;
        int numeroAleatorio = rand.nextInt(10);
    while (numeroAleatorio != numeroEscolhido) {
        System.out.println("Tente adivinhar o numero aleatorio: ");
        numeroEscolhido = sc.nextInt();

    }
    System.out.println("Parabens você acertou o numero aleatorio que era: " + numeroEscolhido);
    }
}
